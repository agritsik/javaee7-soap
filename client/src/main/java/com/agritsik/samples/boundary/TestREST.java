package com.agritsik.samples.boundary;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by andrey on 9/27/15.
 */


@Path("test")
public class TestREST {

    @EJB
    WSClient wsClient;

    @GET
    public String test(){

        wsClient.createProduct();
        return "OK";
    }

}
