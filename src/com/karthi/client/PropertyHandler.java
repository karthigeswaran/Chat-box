package com.karthi.client;

import java.io.FileReader;
import java.util.Properties;

public class PropertyHandler {
  String propFile = "C:\\Users\\karthigeswaran\\Desktop\\Chat box\\resources\\clientProperties.properties";

  public String getProperty(String key){
    FileReader fileReader = new FileReader(propFile);
    Properties prop = new Properties();
    prop.load(fileReader);
    return prop.getProperty(key);
  }
  
}
