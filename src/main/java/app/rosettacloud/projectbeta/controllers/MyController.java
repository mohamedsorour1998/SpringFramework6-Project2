package app.rosettacloud.projectbeta.controllers;

import org.springframework.stereotype.Controller;

import app.rosettacloud.projectbeta.services.GreetingService;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("I am the controller");
        return greetingService.sayGreeting();
    }

}
