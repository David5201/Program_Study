package com.bjsxt.thread.info;

public class MyThread implements Runnable{
    boolean flag =true;
    private int num=0;

    public void stop(){
        flag=!this.flag;
    }
    @Override
    public void run() {
        while(flag){
            System.out.println(Thread.currentThread().getName() + "-->" +num++);
        }
    }
}
