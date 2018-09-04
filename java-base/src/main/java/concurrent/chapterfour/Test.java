package concurrent.chapterfour;

import base.User;

public class Test {

    public static void main(String[] args) {
        UserSet userSet = new UserSet();
        User user = new User();
        user.setId("1");
        user.setUserName("zhouxin");
        userSet.addUser(user);
        System.out.println("before -> user:"+user);
        System.out.println("before -> userSet:"+userSet);
        user.setId("2");
        user.setUserName("hehe");
        System.out.println("after -> user:"+user);
        System.out.println("after -> userSet:"+userSet);
    }
}
