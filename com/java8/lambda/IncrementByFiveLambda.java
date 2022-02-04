package com.java8.lambda;

public class IncrementByFiveLambda {
    public static void main(String[] args) {
        IncrementByFiveInterface increment=(x)->x+5;

        System.out.println(increment.incrementByFive(2));
    }
}
