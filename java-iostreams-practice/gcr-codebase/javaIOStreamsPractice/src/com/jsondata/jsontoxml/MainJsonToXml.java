package com.jsondata.jsontoxml;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;

public class MainJsonToXml {
    public static void main(String[] args) throws Exception {

        ObjectMapper jsonMapper = new ObjectMapper();
        XmlMapper xmlMapper = new XmlMapper();

        Object obj = jsonMapper.readValue(new File("data.json"), Object.class);
        String xml = xmlMapper.writeValueAsString(obj);

        System.out.println(xml);
    }
}
