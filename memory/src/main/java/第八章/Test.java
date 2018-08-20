package 第八章;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

import static java.lang.invoke.MethodHandles.lookup;

public class Test {

    class GrandFather{

        void thinking() throws Throwable{
            System.out.println("i am grandfather");
        }
    }

    class Father extends GrandFather{

        @Override
        void thinking() throws Throwable{
            System.out.println("i am father");
        }
    }

    class Son extends Father{

        @Override
        void thinking() throws Throwable{
            MethodType methodType = MethodType.methodType(void.class);
            MethodHandle methodHandle = lookup().findSpecial(GrandFather.class, "thinking",methodType,getClass());
            methodHandle.invoke(this);
        }
    }

    public static void main(String[] args) throws Throwable{
        (new Test().new Son()).thinking();
    }
}
