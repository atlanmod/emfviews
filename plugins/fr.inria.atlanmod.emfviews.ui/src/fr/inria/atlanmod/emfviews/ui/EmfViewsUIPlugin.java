/*******************************************************************************
 * Copyright (c) 2013 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Juan David Villa Calle - initial API and implementation
 *******************************************************************************/
package fr.inria.atlanmod.emfviews.ui;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class EmfViewsUIPlugin extends AbstractUIPlugin {

  /** The plugin id. */
  public static final String PLUGIN_ID = "fr.inria.atlanmod.emfviews.ui"; //$NON-NLS-1$

  /** The shared instance. */
  private static EmfViewsUIPlugin plugin;

  /**
   * Gets the image at the given plug-in relative path.
   */
  private static Map<String, Image> path2image = new HashMap<String, Image>();

  /** Resource bundle. */
  private ResourceBundle resourceBundle;

  public EmfViewsUIPlugin() {
    super();
    plugin = this;

  }

  public static EmfViewsUIPlugin getDefault() {
    return plugin;
  }

  /**
   * Returns the string from the plugin's resource bundle, or 'key' if not
   * found.
   * 
   * @param key
   *          the default value
   * @return the string from the plugin's resource bundle, or 'key' if not found
   */
  public static String getResourceString(String key) {
    ResourceBundle bundle = EmfViewsUIPlugin.getDefault().getResourceBundle();
    try {
      return (bundle != null) ? bundle.getString(key) : key;
    } catch (MissingResourceException e) {
      return key;
    }
  }

  /**
   * Returns the plugin's resource bundle.
   * 
   * @return the plugin's resource bundle
   */
  public ResourceBundle getResourceBundle() {
    return resourceBundle;
  }

  /**
   * Looks for an image in the icons folder.
   * 
   * @param path
   *          the image path
   * @return the searched Image
   */
  public static Image getImage(String path) {
    Image result = path2image.get(path);
    if (result == null && !path2image.containsKey(path)) {
      ImageDescriptor descriptor = getImageDescriptor(path);
      if (descriptor != null) {
        result = descriptor.createImage();
        path2image.put(path, result);
      }
    }
    if (result != null) {
      if (result.isDisposed()) {
        result = null;
      }
    }
    return result;
  }

  /**
   * Returns the image descriptor with the given relative path.
   * 
   * @param name
   *          the image name
   * @return the image descriptor
   */
  public static ImageDescriptor getImageDescriptor(String name) {
    if (Platform.isRunning()) {
      String pluginDir = plugin.getBundle().getEntry("/").toString(); //$NON-NLS-1$
      String iconPath = "icons/"; //$NON-NLS-1$
      try {
        return ImageDescriptor
            .createFromURL(new URL(pluginDir + iconPath + name));
      } catch (MalformedURLException mfe) {
        return ImageDescriptor.getMissingImageDescriptor();
      }
    }
    return null;
  }

}
