package com.example.threads;

public class C01_Simples {

    public static void main(String[] args) {
        new Thread( () -> System.out.println("t-1") ).start();
        System.out.println( "t2");
    }

}