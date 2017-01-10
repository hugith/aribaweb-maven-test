package app;

import ariba.ui.aribaweb.core.AWDirectAction;
import ariba.ui.aribaweb.core.AWResponse;
import ariba.ui.aribaweb.core.AWResponseGenerating;
import ariba.ui.aribaweb.util.AWResource;
import ariba.ui.servletadaptor.AWStreamingServletResponse;

public class DirectAction extends AWDirectAction {

	public AWResponseGenerating defaultAction() {
		return pageWithName( TestPage.class.getSimpleName() );
	}

	public AWResponseGenerating listAction() {
		application().resourceManager().registerResourceDirectory("/Users/hugi/Documents/workspace-ariba/app/src/main/webapp/docroot", "spork");

		for (Object object : application().resourceManager().allResources()) {
			System.out.println(object);
		}

		AWResponse r = application().createResponse();
		return r;
	}

	public AWResponseGenerating otherAction() {
		AWResource resourceNamed = application().resourceManager().resourceNamed("aribaweb_all.js");
		AWStreamingServletResponse r = new AWStreamingServletResponse();
		r.setContentFromStream(resourceNamed.inputStream());

		/*
		return pageWithName( TestPage.class.getSimpleName() );
		*/
		
		return r;
	}
}