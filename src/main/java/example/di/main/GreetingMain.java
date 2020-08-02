package example.di.main;

// インターフェース
import example.di.Greeting;
import example.di.GreetingClient;
// 実装
import example.di.impl.GreetingImpl;
import example.di.impl.GreetingClientImpl;

public class GreetingMain {
    public static void runGreeting() {
        Greeting greeting = new GreetingImpl();
        GreetingClient greetingClient = new GreetingClientImpl();
        greetingClient.setGreeting(greeting);
        greetingClient.execute();
    }
}
