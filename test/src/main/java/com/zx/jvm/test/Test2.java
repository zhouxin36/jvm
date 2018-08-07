package com.zx.jvm.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test2 {
    private static final Logger logger = LoggerFactory.getLogger(Test2.class);

    /**
     * Integer 为不可变类，传入参数属于引用
     * @param args
     */
    public static void main(String[] args) {
        int i1 = 1;
        Integer i2 = 1;
        cha(i1,i2);
        logger.info("i1:{},i2:{}",i1,i2);

        i1 = 2000;
        i2 = 2000;
        cha(i1,i2);
        logger.info("i1:{},i2:{}",i1,i2);
    }

    static void cha(int i1,Integer i2){
        i1++;
        i2++;
    }
}
