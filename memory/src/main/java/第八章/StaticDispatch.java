package 第八章;

public class StaticDispatch {

    static abstract  class Human{

    }

    static class Man extends Human{

    }

    static class Woman extends Human{

    }

    public static void sayHello(Human guy) {
        System.out.println("hello,guy!");
    }

    public static void sayHello(Man guy) {
        System.out.println("hello,getleman!");
    }

    public static void sayHello(Woman guy) {
        System.out.println("hello,lady!");
    }

    public static void main(String[] args) {
        Human man = new Man();
        Man man2 = new Man();
        Human woman = new Woman();
        StaticDispatch staticDispatch = new StaticDispatch();
        staticDispatch.sayHello(man);
        staticDispatch.sayHello(woman);
        staticDispatch.sayHello(man2);
        staticDispatch.sayHello((Human)man2);
    }
}
