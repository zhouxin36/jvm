package com.zx.jvm.test.lock;

import java.util.ArrayList;
import java.util.List;

public class Test1{
    public static List<Integer> numberList =new ArrayList<>();
    public static class AddToList implements Runnable{
        int startnum=0;
        public AddToList(int startnumber){
            startnum=startnumber;
        }
        @Override
        public void run() {
            int count=0;
            while(count<10000000){
                numberList.add(startnum);
                startnum+=2;
                count++;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Thread t1=new Thread(new AddToList(0));
        Thread t2=new Thread(new AddToList(1));
        t1.start();
        t2.start();
        while(t1.isAlive() || t2.isAlive()){
            Thread.sleep(1);
        }
        System.out.println(numberList.size());

    }

}
