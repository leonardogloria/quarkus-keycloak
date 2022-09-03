package com.example.controller;

import io.quarkus.security.Authenticated;
import org.jboss.resteasy.reactive.NoCache;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/api/admin")
@RolesAllowed("adm")
@NoCache
public class AdminController {
    @GET
    public String admin() {
        return "granted";
    }
}
