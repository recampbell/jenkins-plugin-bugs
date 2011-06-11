package com.cloudbees;

import java.util.logging.Logger;

import hudson.Plugin;
import hudson.model.Hudson;

public class PluginImpl extends Plugin {
	
	public static PluginImpl get() {
		return (PluginImpl) Hudson.getInstance().getPluginManager().getPlugin(PluginImpl.class).getPlugin();
	}
	
	@Override
	public void start() throws Exception {
		Logger.getLogger(Hudson.class.getName()).info("Initializing upstream plugin");
	}
	

}
