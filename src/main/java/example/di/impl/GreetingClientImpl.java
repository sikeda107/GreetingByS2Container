package example.di.impl;

import example.di.Greeting;
import example.di.GreetingClient;

public class GreetingClientImpl implements GreetingClient {
    private Greeting greeting;

    @Override
    public void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }

    @Override
    public void execute() {
        System.out.println(greeting.greet());
    }
}
