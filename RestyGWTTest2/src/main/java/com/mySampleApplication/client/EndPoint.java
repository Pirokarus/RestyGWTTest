package com.mySampleApplication.client;


import com.mySampleApplication.shared.Responce;
import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("jrs")
public interface EndPoint extends RestService {
    @GET
    @Path("/{id}")
    public void responce(MethodCallback<Responce> responce);


}
