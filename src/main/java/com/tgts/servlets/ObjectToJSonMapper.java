/*
 * Copyright (c) Siemens AG 2014 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.tgts.servlets;


import org.apache.log4j.Logger;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Generic class used to serialize object to JSON string and deserialize it in specified objectType
 */
public class ObjectToJSonMapper
{
    private final static Logger logger = Logger.getLogger(ObjectToJSonMapper.class);
    private ObjectMapper objMapper;
    
    public ObjectToJSonMapper()
    {
        this.objMapper = new ObjectMapper();
        this.objMapper.setVisibility(PropertyAccessor.ALL, Visibility.NONE);
        this.objMapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
    }
    
    public String mapObjToJSonStr(Object obj)
    {
        if (obj == null)
            throw new RuntimeException("Object must not be null.");
        
        String jsonStr;
        try
        {
            jsonStr = objMapper.writeValueAsString(obj);
            
            if (logger.isDebugEnabled())
            {
                String msg = jsonStr.length() > 300 ? jsonStr.substring(0, 300) + "..." : jsonStr;
                logger.debug("OBJ -> JSON: " + msg);
            }
        }
        catch (JsonProcessingException e)
        {
            e.printStackTrace();
            throw new RuntimeException("JSON processing failed: {0}"+ e.getMessage());
        }
        return jsonStr;
        
    }
    
    public <T> T mapJSonStrToObj(String jsonStr, Class<T> objType)
    {
        if (jsonStr == null)
            throw new RuntimeException("JSON string must not be null");
        
        try
        {
            if (logger.isDebugEnabled())
                logger.debug("JSON -> OBJ: " + jsonStr);
            
            return objMapper.readValue(jsonStr, objType);
        }
        catch (Exception e)
        {
            throw new RuntimeException("Deserialisation of ''{1}'' failed: {2}"+ e);
        }
    }
}

/*
 * Copyright (c) Siemens AG 2014 ALL RIGHTS RESERVED
 * R8
 */
