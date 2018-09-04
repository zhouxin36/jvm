package concurrent.chapterfour;

import base.User;

import java.util.HashSet;
import java.util.Set;

public class UserSet {

    private final Set<User> set = new HashSet<>();

    public synchronized void addUser(User user){
        set.add(user);
    }

    public synchronized boolean containsUser(User user){
        return set.contains(user);
    }

}
