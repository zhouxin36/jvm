package 第八章;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

import static java.lang.invoke.MethodHandles.lookup;

public class MethodHandleTest {

    static class ClassA{
        public void println(String s){
            System.out.println(s);
        }
    }

    public static void main(String[] args) throws Throwable{
        Object object = System.currentTimeMillis() % 2 == 0 ? System.out : new ClassA();
        getPrintlnMH(object).invoke("ivyfenix");
    }

    private static MethodHandle getPrintlnMH(Object reveiver) throws Throwable{
        MethodType methodType = MethodType.methodType(void.class,String.class);
        return lookup().findVirtual(reveiver.getClass(),"println",methodType).bindTo(reveiver);
    }
}
