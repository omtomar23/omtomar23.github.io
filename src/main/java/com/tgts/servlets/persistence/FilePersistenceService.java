package com.tgts.servlets.persistence;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class FilePersistenceService 
{
	public static final Logger LOGGER = Logger.getLogger(FilePersistenceService.class);
			
	private static final String FILE_EXTENSION = ".xmi";
	private static final String DIR_LOC = "./data/";
	private Map<String, Object> saveOptions;
	private Map<String, Object> loadOptions;
	
	public FilePersistenceService()
	{
		saveOptions = new HashMap<String, Object>();
		loadOptions = new HashMap<String, Object>();
		
		saveOptions.put(XMIResource.OPTION_ENCODING, "UTF-8");
		saveOptions.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SKIP_ESCAPE_URI, Boolean.FALSE);
        
		loadOptions = new HashMap<String, Object>();
		loadOptions.put(XMIResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
		loadOptions.put(XMIResource.OPTION_SKIP_ESCAPE_URI, Boolean.FALSE);
	}
	
	private URI getURI(String entityName)
	{
		URI uri = URI.createURI(DIR_LOC+entityName+"/"+entityName+FILE_EXTENSION);
		return uri;
	}
	
	public void save(EObject entity)throws FilePersistenceException
	{
		LOGGER.info("save-ENTER");
		
		Resource eResource = entity.eResource();
		if(eResource == null)
		{
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().
			getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
			
			Resource resource = resourceSet.createResource(getURI(entity.eClass().getName()));
			resource.getContents().add(entity);
			try 
			{
				resource.save(saveOptions);
			} 
			catch (IOException e)
			{
				LOGGER.error("Problem in saving="+e);
				throw new FilePersistenceException("Problem in file savling");
			}
		}
		else
		{
			
			eResource.getContents().add(entity);
			try 
			{
				eResource.save(saveOptions);
			} 
			catch (IOException e)
			{
				LOGGER.error("Problem in saving="+e);
				throw new FilePersistenceException("Problem in file savling");
			}
		}
		
		LOGGER.info("save-LEAVE");
	}
	
	public EObject load(String entityName)throws FilePersistenceException
	{
		LOGGER.info("load-ENTER");
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().
		getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		Resource resource = resourceSet.createResource(getURI(entityName));
		try 
		{
			resource.load(loadOptions);
		} 
		catch (IOException e) 
		{
			System.out.println(e);
			LOGGER.error("Problem in loading="+e);
			throw new FilePersistenceException("Problem in file loading");
		}
		LOGGER.info("load-LEAVE");
		return resource.getContents().get(0);
	}
	
}
