package com.cloudbees;

import hudson.Plugin;
import hudson.model.Hudson;

import java.util.logging.Logger;

public class DownStreamPluginImpl extends Plugin {

	public static boolean initialized = false;
	
	@Override
	public void start() throws Exception {
		Logger.getLogger(Hudson.class.getName()).info("Initializing downstream");
		//we expect the upstream plugin to be initialized because 
		//we have declared a dependency upon it on it in our pom
		assert null != PluginImpl.get();
		initialized = true;
	}
}
