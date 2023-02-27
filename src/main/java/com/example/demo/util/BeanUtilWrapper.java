package com.example.demo.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.LinkedHashMap;
import java.util.Map;

public class BeanUtilWrapper {
    public static Map object2map(Object o){
        ObjectMapper objectMapper = new ObjectMapper();
        @SuppressWarnings("unchecked")
        Map<String, Object> objectAsMap = objectMapper.convertValue(o, LinkedHashMap.class);
        return objectAsMap;
    }
}
