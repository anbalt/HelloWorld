package src.by.itacademy.hw11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
    private static UserRepository instance;
    private final Map<String, User> users = new HashMap<>();

    private UserRepository() {
        createUsers();
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public static UserRepository getInstance() {
        if(instance == null) {
            return new UserRepository();
        }
        return instance;
    }

    private void createUsers() {
        users.put("Login_1", new User("Login_1", "qwerty_123"));
        users.put("Login_2", new User("Login_2", "asdfgh_456"));
        users.put("Login_3", new User("Login_3", "zxcvbn_789"));
    }
}
