package com.zx.jvm.test;

import java.util.HashMap;

public class Test4 {
    public static void main(String[] args) {
        Thread thread1 = new PrintThread();
        Thread thread2 = new MyThread();

        thread1.run();
        thread2.run();
    }
}


class PrintThread extends Thread{
    public static final long starttime=System.currentTimeMillis();
    @Override
    public void run(){
        try{
            while(true){
                long t=System.currentTimeMillis()-starttime;
                System.out.println("time:"+t);
                Thread.sleep(100);
            }
        }catch(Exception e){

        }
    }
}

class MyThread extends Thread{
    HashMap<Long,byte[]> map=new HashMap<Long,byte[]>();
    @Override
    public void run(){
        try{
            while(true){
                if(map.size()>=450){
                    System.out.println("=====准备清理=====:"+map.size());
                    map.clear();
                }

                for(int i=0;i<1024;i++){
                    map.put(System.nanoTime(), new byte[512]);
                }
                Thread.sleep(1);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
