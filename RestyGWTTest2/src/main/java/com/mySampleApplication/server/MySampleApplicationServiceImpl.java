package com.mySampleApplication.server;


import com.mySampleApplication.shared.Responce;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("jrs")
public class MySampleApplicationServiceImpl  {
    // Implementation of sample interface method
    @GET
    @Produces("aplication/json")
    @Path("/{id}")
    public Responce responce()
    {
        Responce responce = new Responce();
        responce.setA("succes");
        return responce;
    }
}