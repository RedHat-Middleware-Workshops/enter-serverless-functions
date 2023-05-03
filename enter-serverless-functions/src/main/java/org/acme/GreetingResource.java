package org.acme;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

// import io.quarkus.funqy.Funq;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingService greetingService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}")
    public String greeting(String name) {
        return greetingService.greeting(name);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello Serverless";
    }

    // @Funq
    // public String greeting(String name) {
    //     return greetingService.greeting(name);
    // }

    // @Funq
    // public String hello() {
    //     return "Hello Serverless";
    // }

}