package example.di.main;

// インターフェース
import example.di.Greeting;
import example.di.GreetingClient;
import example.di.GreetingClient2;
// 実装
import example.di.impl.GreetingImpl;
import example.di.impl.GreetingClientImpl;
import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.S2ContainerFactory;

public class GreetingMain {

    private static final String PATH2 = "dicon/GreetingMain2.dicon";
    private static final String PATH = "dicon/GreetingMain3.dicon";
    private static final String PATH_2 = "dicon/GreetingMain3-2.dicon";

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

    public static void runGreetingByS2Container2(){
        //S2コンテナの作成
        S2Container container = S2ContainerFactory.create(PATH_2);
        //コンポーネントの取得
        GreetingClient2 greetingClient2 = (GreetingClient2) container.getComponent(GreetingClient2.class);

        greetingClient2.execute();
    }
}
