package src.by.itacademy.hw11;

import src.by.itacademy.hw11.Exceptions.WrongLoginException;
import src.by.itacademy.hw11.Exceptions.WrongPasswordException;

import java.util.Scanner;

public class Action {
    private final Service service = new Service();
    Scanner scanner = new Scanner(System.in);

    public void signIn() {
        String login = entryLogin("Login: ");
        String password = entryPassword("Password: ");

        try {
            service.signIn(login, password);
        } catch (WrongLoginException e) {
            System.out.println("Sign In Error: " + e.getMessage());
        }
        System.out.println("Signed In successfully");
    }

    public void signUp() {
        String login = entryLogin("Login: ");
        String password = entryPassword("Password: ");

        try {
            service.signIn(login, password);
        } catch (WrongPasswordException e) {
            System.out.println("Sign Up Error: " + e.getMessage());
        }
        System.out.println("Signed Up successfully");
    }

    private String entryLogin(String notification) {
        System.out.println(notification);
        return scanner.nextLine();
    }

    private String entryPassword(String notification) {
        System.out.println(notification);
        return scanner.nextLine();
    }
}
