package set;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println("thread:"+Thread.currentThread().getName());
        list.add("z");
        list.add("zh");
        list.add("zho");
        list.add("zhou");
        list.add("zhoux");
        list.add("zhouxi");
        list.add("zhouxin");
        list.forEach((e)->{
            System.out.println("thread:"+Thread.currentThread().getName()+",value:"+e);
        });
    }
}
