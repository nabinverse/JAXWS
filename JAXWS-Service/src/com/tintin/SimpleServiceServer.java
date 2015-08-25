
package com.tintin;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.0.0
 * 2015-08-25T15:18:13.837+05:30
 * Generated source version: 3.0.0
 * 
 */
 
public class SimpleServiceServer{

    protected SimpleServiceServer() throws Exception {
        System.out.println("Starting Server");
        Object implementor = new com.tintin.SimpleServiceImpl();
        String address = "http://localhost:9090/SimpleServiceImplPort";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws Exception { 
        new SimpleServiceServer();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
 
 