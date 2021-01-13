package com.bjsxt.thread.create;

public class RabbitApp {
    public static void main(String[] args) {
        Rabbit rab = new Rabbit();
        Tortoise tor = new Tortoise();
        //调用start 方法
        rab.start(); //不要调用run方法
        tor.start();


        for (int i = 0; i <1000; i++) {
            System.out.println("main==>" + i);
        }
    }
}
