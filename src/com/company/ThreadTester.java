package com.company;

public class ThreadTester {

    public static void main(String[] args) {

        Thread hilo1 = new Thread(new PrintMe(), "Hilo 1");
        Thread hilo2 = new Thread(new PrintMe(), "Hilo 2");
        Thread hilo3 = new Thread(new PrintMe(), "Hilo 3");

        hilo1.start();
        hilo2.start();
        hilo3.start();

    }
}
