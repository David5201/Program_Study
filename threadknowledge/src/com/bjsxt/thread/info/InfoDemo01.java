package com.bjsxt.thread.info;
/*
    Thread.currentThread()
    setName()
    getName()
    isAlive()


 */
public class InfoDemo01 {


    public static void main(String[] args) throws InterruptedException {
        MyThread it =new MyThread();
        Thread proxy = new Thread(it,"挨踢");
        proxy.setName("test");
        System.out.println(proxy.getName());
        System.out.println(Thread.currentThread().getName()); //main

       proxy.start();
        System.out.println("启动后的状态：" + proxy.isAlive());
       Thread.sleep(200);
       it.stop();
        Thread.sleep(100);
        System.out.println("停止后的状态："+ proxy.isAlive());
    }
}
