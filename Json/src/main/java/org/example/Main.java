package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        SomeData someData = new SomeData();
        InnerObject innerObject = new InnerObject();
        innerObject.setParam1("Hello");
        innerObject.setParam2("World");
        someData.setInnerObject(innerObject);

        String result = objectMapper.writeValueAsString(someData);
        System.out.println(result);

        SomeData newData = objectMapper.readValue(result, SomeData.class);
        System.out.println(newData.getInnerObject().getParam2());
    }
}
