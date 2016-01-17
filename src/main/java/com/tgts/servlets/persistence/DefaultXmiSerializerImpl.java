/*
 * Copyright (c) Siemens AG 2013 ALL RIGHTS RESERVED.
 *
 * R8
 *
 */

package com.tgts.servlets.persistence;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.xml.sax.InputSource;


/**
 * Default implementation of a Serializer using the XML format
 */
public class DefaultXmiSerializerImpl
{
    private static final Logger logger = Logger.getLogger(DefaultXmiSerializerImpl.class);
    
    private static final int STRING_LOG_LENGTH_MAX = 200;
    
    /**
     * the default XMI processor
     */
    private XMLProcessor xmlProcessor = null;
    
    /**
     * the save options
     */
    private final Map<String, Object> mSaveOptions;
    
    /**
     * the load options
     */
    private final Map<String, Object> mLoadOptions;
    
    /**
     * Default constructor
     */
    public DefaultXmiSerializerImpl()
    {
        xmlProcessor = new XMLProcessor();
        
        mSaveOptions = new HashMap<String, Object>();
        mSaveOptions.put(XMIResource.OPTION_ENCODING, "UTF-8");
        mSaveOptions.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE);
        mSaveOptions.put(XMIResource.OPTION_SKIP_ESCAPE_URI, Boolean.FALSE);
        
        mLoadOptions = new HashMap<String, Object>();
        mLoadOptions.put(XMIResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
        mLoadOptions.put(XMIResource.OPTION_SKIP_ESCAPE_URI, Boolean.FALSE);
    }
    
    public String serialize(EObject entity) throws RuntimeException
    {
        if (logger.isDebugEnabled())
            logger.debug("ENTER serialize - entity=");
        
        String serializedEntity = null;
        
        if (entity instanceof EObject)
        {
        	EObject identifiableEntity = (EObject) entity;
            Resource resource = identifiableEntity.eResource();
            
            if (resource == null)
            {
                resource = new XMIResourceImpl();
                resource.getContents().add(identifiableEntity);
            }
            
            serializedEntity = serialize(resource);
        }
        else
        {
            throw new RuntimeException("Entity to be serialized must be of type IdentifiableEntity!");
        }
        
        if (logger.isDebugEnabled())
            logger.debug("LEAVE serialize - serializedEntity=" + limitString(serializedEntity));
        
        return serializedEntity;
    }
    
    private String serialize(Resource resource) throws RuntimeException
    {
        try
        {
            StringWriter sw = new StringWriter();

            synchronized (xmlProcessor)
            {
                //instead of using method saveToString(Resource, Map) or save(ByteArrayOutputString, Resource, Map) this method should be
                //the preferred choice in order to avoid String-> byte[] -> String conversion each time
                xmlProcessor.save(sw, resource, mSaveOptions);

                return sw.toString();
            }
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
    
    public EObject deserialize(String serializedEntity) throws RuntimeException
    {
        if(logger.isDebugEnabled())
            logger.debug("ENTER deserialize - serializedEntity=" + limitString(serializedEntity));
        
        EObject entity = null;
        
        if (serializedEntity != null && !serializedEntity.isEmpty())
        {
            try
            {
                XMIResource resource = new XMIResourceImpl();
                InputSource inputSource = new InputSource(new StringReader(serializedEntity));
                resource.load(inputSource, mLoadOptions);

                entity = (EObject) resource.getContents().get(0);
            }
            catch (Exception e)
            {
                throw new RuntimeException(e);
            }
        }
        else
        {
            throw new RuntimeException("String to be deserialized must not be null!");
        }
        
        if (logger.isDebugEnabled())
            logger.debug("LEAVE deserialize - entity=");

        return entity;
    }
    
    private final String limitString(String entity)
    {
        return (entity != null && entity.length() > STRING_LOG_LENGTH_MAX) ? entity.substring(0, STRING_LOG_LENGTH_MAX) + "..." : entity;
    }

}

/*
 * Copyright (c) Siemens AG 2013 ALL RIGHTS RESERVED
 *
 * R8
 */
