package com.karthi.client;

import java.net.Socket;

import com.karthi.client.PropertyHandler;

public class Client {
  public void getConnection(){

    PropertyHandler prop = new PropertyHandler();
    String hostName = prop.getProperty("hostname");
    Integer port = Integer.parseInt(prop.getProperty("port"));
    Socket clientSocket = new Socket(hostName,port);

  }

  
}
