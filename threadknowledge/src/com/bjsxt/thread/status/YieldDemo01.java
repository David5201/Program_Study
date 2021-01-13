package com.bjsxt.thread.status;
/*
join: 合并线程


 */
public class YieldDemo01 extends Thread{

    public static void main(String[] args) throws InterruptedException {
        YieldDemo01 demo=new YieldDemo01();
        Thread t = new Thread(demo);//新生
        t.start();//就绪
        //cpu调度运行
        for (int i = 1; i < 1000; i++) {
            if(i %20==0){
                //暂停本线程main
                System.out.println("stop?");
                Thread.yield();
            }
            System.out.println("main...."+ i);
        }

    }


    @Override
    public void run() {
        for (int i = 1; i < 1000; i++) {
            System.out.println("yield...." +i);
        }
    }
}
