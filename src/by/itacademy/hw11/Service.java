package src.by.itacademy.hw11;

import src.by.itacademy.hw11.Exceptions.NoUserException;
import src.by.itacademy.hw11.Exceptions.UserWithThisLoginAlreadyExists;
import src.by.itacademy.hw11.Exceptions.WrongLoginException;
import src.by.itacademy.hw11.Exceptions.WrongPasswordException;

import java.util.*;

public class Service {

    private static final String LOGIN_REGEX = "[\\w+]{5,20}";
    private static final String PASSWORD_REGEX = "[\\w+]{8,}";
    private final Map<String, User> users = UserRepository.getInstance().getUsers();

    public void signIn (String login, String password) {

        User user = findUser(login).orElseThrow(() -> new NoUserException("The user does not exist!"));

        if (user.getPassword().equals(password)) {
            throw new WrongPasswordException("The password is wrong");
        }
    }

    public String signUp(String login, String password) {

        if(!login.matches(LOGIN_REGEX)) {
            throw new WrongLoginException("The login should consist of 5-20 signs. \n" +
                        "The login may contain the following symbols only: \n" +
                        "latin letters; \n" + "numbers; \n" + "underscore.");
        }


        if (!password.matches(PASSWORD_REGEX)) {
            throw new WrongPasswordException("The password should consist of at least 8 signs. \n" +
                    "The login may contain the following symbols only: \n" +
                    "latin letters; \n" + "numbers; \n" + "underscore.");
        }

        if (findUser(login).isEmpty()) {
            users.put(login, new User(login, password));
        } else {
            throw new UserWithThisLoginAlreadyExists("User with this login already exists. Generate the new one!");
        }
        return login;
    }

    private Optional<User> findUser(String login) {
        return Optional.ofNullable(users.get(login));
    }
}
