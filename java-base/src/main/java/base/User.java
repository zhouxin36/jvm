package base;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class User {
    private String id;
    private String userName;

    public User() {
        this.id = "1";
        this.userName = "zhouxin";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("userName", userName)
                .toString();
    }
}
