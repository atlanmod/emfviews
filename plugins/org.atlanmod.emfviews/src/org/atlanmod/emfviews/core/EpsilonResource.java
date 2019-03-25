package org.atlanmod.emfviews.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.epsilon.emc.bibtex.BibtexModel;
import org.eclipse.epsilon.emc.csv.CsvModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;

public class EpsilonResource extends ResourceImpl {

  IModel model;

  Map<Object, EpsilonEObject> cached = new HashMap<>();
  Function<Object, EClass> objectEClass;

  public EpsilonResource(URI uri) {
    super(uri);
  }

  public IModel getEpsilonModel() {
    return model;
  }

  @Override
  protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
    if (uri.fileExtension().equals("csv")) {
      CsvModel m = new CsvModel();
      m.setKnownHeaders(true);
      m.setReader(new BufferedReader(new InputStreamReader(inputStream)));
      model = m;

      // @Correctness: need to ensure that package exists
      objectEClass = obj -> (EClass) EPackage.Registry.INSTANCE.getEPackage("csv").getEClassifier("Row");

    } else if (uri.fileExtension().equals("bib")) {
      BibtexModel m = new BibtexModel();
      m.setBibtex(new BufferedReader(new InputStreamReader(inputStream)).lines().collect(Collectors.joining("\n")));
      model = m;

    } else {
      throw new UnsupportedOperationException("Cannot load model");
    }

    try {
      model.load();
    } catch (EolModelLoadingException e) {
      e.printStackTrace();
    }
  }

  @Override
  public EList<EObject> getContents() {
    List<EObject> l = new ArrayList<>();

    for (Object o : model.allContents()) {
      l.add(asEObjectUnchecked(o));
    }

    return ECollections.toEList(l);
  }

  // Use when we know `o` is owned by the model.
  private EObject asEObjectUnchecked(Object o) {
    return cached.computeIfAbsent(o,
      obj -> new EpsilonEObject(obj, model.getPropertyGetter(), objectEClass.apply(o)));
  }

  public EObject asEObject(Object o) {
    if (!model.owns(o)) {
      throw new IllegalArgumentException(String.format("Model %s does not own object %s", this, o));
    }

    return asEObjectUnchecked(o);
  }
}
