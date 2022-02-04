package com.java8.lambda;

public class HelloWorldLambda {
    public static void main(String[] args) {
        HelloWorldInterface helloWorldInterface = () -> {
            return "Hello World";
        };
        System.out.println(helloWorldInterface.sayHelloWorld());
    }
}
