package com.hm;


import java.util.HashSet;

public class UserHolder {
    public static HashSet<User> users = new HashSet<>();

    static {
        users.add(new User("JohnDoe1", "12"));
        users.add(new User("JohnDoe2", "123"));
        users.add(new User("JohnDoe3", "1234"));
        users.add(new User("JohnDoe4", "12345"));
        users.add(new User("JohnDoe5", "123456"));
    }

    public static User search(String login, String pass) {
        return users.stream()
                .filter(user -> user.getLogin().equals(login) && user.getPass().equals(pass))
                .findFirst()
                .orElse(null);

    }
}
