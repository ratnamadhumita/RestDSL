package com.restdsl.camel.java;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

import com.aimco.esb.file.bean.FileOperationsBean;


/**
 * A Camel Java DSL Router
 */
public class RestDSLRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

   /* 	restConfiguration().component("jetty")
         .bindingMode(RestBindingMode.json)
         .dataFormatProperty("prettyPrint", "true")
         .port(8080);
*/
    	
    	restConfiguration().component("servlet")
    	.bindingMode(RestBindingMode.json)
         .dataFormatProperty("prettyPrint", "true")
         .port(8080);
    	
    	 rest
    	 ("/CommonServices").description("Test rest service")
         .consumes("application/json").produces("application/json")
         .post().type(FileOperationsBean.class).to("direct:test");
    	 
    


}
}
