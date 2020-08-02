package example.di.main;

// インターフェース
import example.di.Greeting;
import example.di.GreetingClient;
// 実装
import example.di.impl.GreetingImpl;
import example.di.impl.GreetingClientImpl;
import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.S2ContainerFactory;

public class GreetingMain {

    private static final String PATH = "dicon/GreetingMain2.dicon";

    private GreetingMain() {}

    public static void runGreeting() {
        Greeting greeting = new GreetingImpl();
        GreetingClient greetingClient = new GreetingClientImpl();
        greetingClient.setGreeting(greeting);
        greetingClient.execute();
    }

    public static void runGreetingByS2Container(){
        //S2コンテナの作成
        S2Container container = S2ContainerFactory.create(PATH);
        //コンポーネントの取得
        GreetingClient greetingClient = (GreetingClient) container.getComponent(GreetingClient.class);

        greetingClient.execute();
    }
}
