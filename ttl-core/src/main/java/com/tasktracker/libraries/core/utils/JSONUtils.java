package com.tasktracker.libraries.core.utils;

import com.google.gson.Gson;

import java.lang.reflect.Type;

/**
 * Created by u6019943 on 06/07/2015.
 */
public class JSONUtils {

    public static String objectToJson(Object o){
        return new Gson().toJson( o );
    }

    public static Object jsonToObject(String json, Class c){
        return new Gson().fromJson( json, c );
    }

    public static Object jsonToObject(String json, Type t){
        return new Gson().fromJson( json, t );
    }

}
