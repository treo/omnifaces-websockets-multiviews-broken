package com.example.demo;

import org.omnifaces.cdi.Push;
import org.omnifaces.cdi.PushContext;
import org.omnifaces.cdi.ViewScoped;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 */
@RequestScoped
@Named("hello")
public class HelloController {

    @Inject
    @Push
    PushContext hello;

    public void sayHello() {
        hello.send("Hello");
    }
}
