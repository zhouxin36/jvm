package com.zx.jvm.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test3 {
    private static final Logger logger = LoggerFactory.getLogger(Test3.class);

    private static void tr(int index,String userName){
        logger.info("index:{},userName:{}",index,userName);
        index++;
        tr(index,userName);
    }

    public static void main(String[] args) {
        tr(0,"zhouxin");
    }
}

/**
 * -server -Xmx10m -Xms10m
 * -XX:+DoEscapeAnalysis -XX:+PrintGC
 *
 *
 * -server -Xmx10m -Xms10m
 * -XX:-DoEscapeAnalysis -XX:+PrintGC
 *
 * +PrintGCDetails  GC详细信息
 * +PrintHeapAtGC  GC 前后堆的变化
 * +TraceClassLoading 监控类的加载
 * +PrintClassHistogram   按Ctrl+Break后，打印类的信息
 * -Xmx -Xms  指定最大堆最小堆
 * -Xmn 设置新生代大小，绝对值
 * -XX:NewRatio 设置新生代大小，比例 4表示新：老=1:4
 * -XX:SurvivorRatio 两个Survivor区（from，to）和Eden的比，8表示survivor：Eden=2:8
 * -XX:+HeapDumpOnOutOfMemoryError 异常OutOfMemoryError发生时导出对文件
 * -XX:HeapDumpPath=    导出OOM的路径
 * -XX:OnOutOfMemoryError=  在OOM时，执行一个脚本
 *
 * -XX:PermSize -XX:MaxPermSize  设置永久区初始空间和最大空间
 *
 * -Xss 栈大小分配
 */
class OnStackTest {
    public static void alloc(){
        byte[] b=new byte[2];
        b[0]=1;
    }
    public static void main(String[] args) {
        long b=System.currentTimeMillis();
        for(int i=0;i<100000000;i++){
            alloc();
        }
        long e=System.currentTimeMillis();
        System.out.println(e-b);
    }
}
