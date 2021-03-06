package com.tasktracker.libraries.core.utils;

import com.tasktracker.libraries.core.exception.StringManipulationException;
import com.tasktracker.libraries.core.exception.error.StringErrorCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * Created by u6019943 on 06/07/2015.
 */
public class StringUtils {

    public static String toCamelCase(String s, String delimiter){
        String[] parts = s.split(delimiter);
        String camelCaseString = "";
        for (String part : parts){
            camelCaseString = camelCaseString + toProperCase(part);
        }
        return firstLetterLowerCase(camelCaseString);
    }

    public static String toProperCase(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public static String firstLetterLowerCase(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(0,1).toLowerCase());
        sb.append(s.substring(1));

        return sb.toString();
    }

    public static ArrayList<String> stringArrayToArrayList(String[] array){
        ArrayList<String> arrayList = new ArrayList<>();
        for(String a : array){
            arrayList.add(a);
        }
        return arrayList;
    }

    public static String replaceLastChars(String originalString, String replaceString, int endOffset) throws StringManipulationException {
        if (originalString.length() < endOffset) throw new StringManipulationException(StringErrorCode.STRING_LENGTH_OVERFLOW, String.valueOf(endOffset));
        return originalString.substring(0, originalString.length() - endOffset) + replaceString;
    }

    public static String createPathParams(List<String> params){
        String paramUrl = "/";
        if(params!=null){
            for (String key : params) {
                paramUrl+=key+"/";
            }
            paramUrl = paramUrl.substring(0, paramUrl.length()-1);
        }
        return paramUrl;
    }

    public static String createQueryParams(Map<String, String> params){
        String paramUrl = "";
        if(params!=null){
            paramUrl="?";
            for (String key : params.keySet()) {
                paramUrl+=params.get(key)+"&";
            }
            paramUrl = paramUrl.substring(0, paramUrl.length()-1);
        }
        return paramUrl;
    }
}
