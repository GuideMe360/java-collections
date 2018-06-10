package com.guideme.demorest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("alien")
public class AlienResources {
	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public Alien getAlien() {
		Alien a1 = new Alien("Arun", 10); 
		System.out.println(a1);
		return a1;
	}
}
