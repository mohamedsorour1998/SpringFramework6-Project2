package app.rosettacloud.projectbeta.services;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        System.out.println("Hello");
        return "Hello";
    }

}
