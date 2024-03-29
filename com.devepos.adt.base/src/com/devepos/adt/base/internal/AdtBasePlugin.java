package com.devepos.adt.base.internal;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class AdtBasePlugin extends AbstractUIPlugin {

  // The plug-in ID
  public static final String PLUGIN_ID = "com.devepos.adt.base"; //$NON-NLS-1$

  // The shared instance
  private static AdtBasePlugin plugin;

  /**
   * The constructor
   */
  public AdtBasePlugin() {
  }

  @Override
  public void start(final BundleContext context) throws Exception {
    super.start(context);
    plugin = this;
  }

  @Override
  public void stop(final BundleContext context) throws Exception {
    plugin = null;
    super.stop(context);
  }

  /**
   * Returns the shared instance
   *
   * @return the shared instance
   */
  public static AdtBasePlugin getDefault() {
    return plugin;
  }
}
