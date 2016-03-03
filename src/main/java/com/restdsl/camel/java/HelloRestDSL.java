package com.restdsl.camel.java;

import java.io.File;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;



public class HelloRestDSL {
	
	
	
	public Boolean createDirectory(  String name){

    	
    	System.out.println("######## Name   " + name);
    	Boolean status=true;
		return status;
		
	}

}
