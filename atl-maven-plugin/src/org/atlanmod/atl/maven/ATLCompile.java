package org.atlanmod.atl.maven;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.project.MavenProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.atl.engine.compiler.AtlCompiler;
import org.eclipse.m2m.atl.common.Problem.Problem;;

/**
 * @author fmdkdd - initial API and implementation
 * @goal compile
 * @phase compile
 */
public class ATLCompile extends AbstractMojo {

  /**
   * The project itself. This parameter is set by maven.
   * @parameter property=project
   * @required
   */
  protected MavenProject project;

  @Override
  public void execute() throws MojoExecutionException {
    try {
      // Find all ATL files from the project base directory and compile them
      List<Path> atlFiles = Files.walk(Paths.get(project.getBasedir().toURI()))
          .filter(Files::isRegularFile)
          .filter(p -> p.getFileName().toString().endsWith(".atl"))
          .collect(Collectors.toList());

      for (Path p : atlFiles) {
        final Reader r = Files.newBufferedReader(p);
        String outputPath = p.resolveSibling(p.getFileName().toString().replace(".atl", ".asm")).toString();
        getLog().debug("Compiling " + p + " to " + outputPath);
        EObject problems[] = AtlCompiler.compile(r, outputPath);
        r.close();

        // Display any errors
        for (EObject o : problems) {
          if (o instanceof Problem) {
            Problem pb = (Problem) o;
            getLog().error(String.format("%s:%s:%s", pb.getSeverity(), pb.getLocation(), pb.getDescription()));
          }
        }

        // Bail if there was any error
        if (problems.length > 0) {
          throw new MojoExecutionException("Failed to compile ATL files due to above errors");
        }
      }
    } catch (IOException ex) {
      throw new MojoExecutionException("Failed to compile ATL files", ex);
    }
  }
}
