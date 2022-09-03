package com.example.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/api/public")

public class PublicController {
    @GET
    public String publicMethod(){
        return "public";
    }
}
