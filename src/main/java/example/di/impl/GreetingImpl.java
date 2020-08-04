package example.di.impl;

import example.di.Greeting;

public class GreetingImpl implements Greeting {
    @Override
    public String greet() {
        return "Hello World!";
    }
}
