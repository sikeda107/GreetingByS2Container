package example.di.impl;

import example.di.Greeting;
import example.di.GreetingClient2;

public class GreetingClient2Impl implements GreetingClient2 {

    private final Greeting greeting2;

    GreetingClient2Impl(Greeting greeting2) {
        this.greeting2 = greeting2;
    }

    @Override
    public void execute() {
        System.out.println(greeting2.greet());
    }
}
