package src.by.itacademy.hw11.Exceptions;

public class WrongPasswordException extends RuntimeException {
    private String notification;

    public WrongPasswordException(String s) {
        notification = "The password is wrong";
    }

    @Override
    public String toString() {
        return "WrongPasswordException{" +
                "notification='" + notification + '\'' +
                '}';
    }
}
