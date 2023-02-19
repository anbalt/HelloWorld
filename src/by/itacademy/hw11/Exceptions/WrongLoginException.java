package src.by.itacademy.hw11.Exceptions;

public class WrongLoginException extends RuntimeException {
    private String notification;

    public WrongLoginException(String s) {
        notification = "The login is wrong";
    }

    @Override
    public String toString() {
        return "WrongLoginException{" +
                "notification='" + notification + '\'' +
                '}';
    }
}
