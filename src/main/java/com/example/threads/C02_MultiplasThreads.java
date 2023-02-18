package com.example.threads;

public class C02_MultiplasThreads {

    public static void main(String[] args) {

        Runnable r1 = () -> System.out.println("r1");
        Runnable r2 = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println( "r2:" + i );
            }
        };

        System.out.println("inicio");
        new Thread(r1).start();
        new Thread(r2).start();
        new Thread(r1).start();
        System.out.println("fim");


    }

}