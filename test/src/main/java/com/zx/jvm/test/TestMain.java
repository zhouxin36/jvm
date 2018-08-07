package com.zx.jvm.test;

public class TestMain {
    private static int a=0xDada_Cafe;
    private static float b=0x1.fffffeP+127f;
    private static float c=1996;
    private static float d=193.13f;
    private static double f=9999e2;
    private static double g=33.121212e2;
    private static float h=0x1.fffep-12f;
    private static long p=0b11101;


    public static void main(String[] args) {
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
        System.out.println("f:"+f);
        System.out.println("g:"+g);
        System.out.println("h:"+h);
        System.out.println("p:"+p);
        System.out.println(0x80000001);
        System.out.println(Integer.MAX_VALUE);
    }
}
