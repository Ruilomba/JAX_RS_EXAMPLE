package com.thejavageek.jaxrs;

import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 
@Path("/Calculator")
public class HelloWorldService {
 	
	
	@GET
	@Path("/{type}/{num1}/{num2}")
	public Response calc(@PathParam("num1") int num1,@PathParam("num2") int num2,@PathParam("type") String type) {
		if(type.equals("sub")) {
			return Response.status(200).entity("Subtraction result it: "+(num1-num2)).build();
		}else {
			return Response.status(200).entity("Addiction result it: "+(num1+num2)).build();
		}
	}

}