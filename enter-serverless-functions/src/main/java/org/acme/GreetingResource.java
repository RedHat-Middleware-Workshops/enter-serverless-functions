package org.acme;

import javax.inject.Inject;
import io.quarkus.funqy.Funq;

public class GreetingResource {

    @Inject
    GreetingService greetingService;

    @Funq
    public String greeting(String name) {
        return greetingService.greeting(name);
    }

    @Funq
    public String hello() {
        return "Hello Serverless";
    }
}