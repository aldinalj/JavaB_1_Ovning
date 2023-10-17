package com.aldina.demo;

import com.aldina.demo.Counter;


public class Main {
    public static void main(String[] args) {

        Counter counterOne = new Counter();
        Counter counterTwo = new Counter();
        Counter counterThree = new Counter();
        counterOne.counter();
        counterTwo.counterStatic();
        counterThree.counterStatic();

    }
}
