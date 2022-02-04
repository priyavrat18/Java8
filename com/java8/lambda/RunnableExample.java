package com.java8.lambda;

public class RunnableExample {
    public static void main(String[] args) {

//traditional implementation of runnable
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            int sum=0;
            for(int i=0;i<10;i++){
                sum+=i;
            }
            System.out.println("Traditional: "+sum);
        }
    };
    new Thread(runnable).start();

    //Lambda implementation of runnable
        Runnable runnable1=()->{
            int sum=0;
            for(int i=0;i<10;i++)
                sum+=i;
            System.out.println("Runnable lambda: "+sum);

        };
        new Thread(runnable1).start();

        //implement using simpler lambda

        new Thread(()->{
            int sum=0;
            for(int i=0;i<10;i++)
                sum+=i;
            System.out.println("Simpler lambda: "+sum);
        }).start();

    }
}
