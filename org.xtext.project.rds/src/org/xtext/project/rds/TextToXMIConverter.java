package org.xtext.project.rds;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

public class TextToXMIConverter {
	
	public static void main(String[] args) {
	    Injector injector = new MyRdsStandaloneSetup().createInjectorAndDoEMFRegistration();
	    XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);

	    // replace absoluteTargetFolderPath with the path to your folder
	    String absoluteTargetFolderPath = "C:\\Users\\samih\\OneDrive\\Documents\\Winter 2022\\ECSE 439\\Projects\\Projects\\ecse439-project\\org.xtext.project.rds\\examples\\";
	    String inputURI = "file:///" + absoluteTargetFolderPath + "example2.rds";
	    String outputURI = "file:///" + absoluteTargetFolderPath + "example2.xmi";
	    
	    URI uri = URI.createURI(inputURI);
	    Resource xtextResource = resourceSet.getResource(uri, true);

	    EcoreUtil.resolveAll(xtextResource);

	    Resource xmiResource = resourceSet.createResource(URI.createURI(outputURI));
	    xmiResource.getContents().add(xtextResource.getContents().get(0));
	    try {
	        xmiResource.save(null);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

}
