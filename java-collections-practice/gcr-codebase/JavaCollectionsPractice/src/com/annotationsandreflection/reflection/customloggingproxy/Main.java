package com.annotationsandreflection.reflection.customloggingproxy;

public class Main {
    public static void main(String[] args) {

        Greeting g = new GreetingImpl();
        Greeting proxy = (Greeting) LoggingProxy.createProxy(g);

        proxy.sayHello();
    }
}
