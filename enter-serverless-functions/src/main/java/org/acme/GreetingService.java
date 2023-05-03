package org.acme;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {
        return "Enter Serverless Functions with Quarkus, " + name;
    }

}