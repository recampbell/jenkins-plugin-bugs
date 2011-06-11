package com.cloudbees.bugs;

import org.jvnet.hudson.test.HudsonTestCase;

import com.cloudbees.DownStreamPluginImpl;

public class PluginDependencyTest extends HudsonTestCase {
	
	
	
	public void testUpstreamInitializedFirst () {
		assert DownStreamPluginImpl.initialized : "Expected the plugin to be initialized";
	}
}
