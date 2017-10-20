package fr.inria.atlanmod.emfviews.ui.editors;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;

public class EObjectAdapterFactory implements IAdapterFactory {

  @SuppressWarnings("unchecked")
  @Override
  public <T> T getAdapter(Object o, Class<T> type) {
    if (type == IPropertySource.class && o instanceof EObject) {

      final EObject obj = (EObject) o;

      return (T) new IPropertySource() {

        @Override
        public Object getEditableValue() {
          return null;
        }

        @Override
        public IPropertyDescriptor[] getPropertyDescriptors() {

          EList<EStructuralFeature> features = obj.eClass().getEAllStructuralFeatures();
          IPropertyDescriptor[] props = new IPropertyDescriptor[features.size()];

          for (int i=0; i < features.size(); ++i) {
            EStructuralFeature f = features.get(i);
            props[i] = new PropertyDescriptor(f.getName(), f.getName());
          }

          return props;
        }

        @Override
        public Object getPropertyValue(Object id) {
          EStructuralFeature feature = obj.eClass().getEStructuralFeature((String) id);

          if (feature != null) {
            return obj.eGet(feature);
          } else {
            return null;
          }
        }

        @Override
        public boolean isPropertySet(Object id) {
          return false;
        }

        @Override
        public void resetPropertyValue(Object id) {
        }

        @Override
        public void setPropertyValue(Object id, Object value) {
        }

      };
    } else {
      return null;
    }
  }

  @Override
  public Class<?>[] getAdapterList() {
    return new Class[] { IPropertySource.class };
  }

}
