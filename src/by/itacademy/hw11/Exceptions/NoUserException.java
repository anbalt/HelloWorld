package src.by.itacademy.hw11.Exceptions;

public class NoUserException extends RuntimeException {
    private final String notification;

    public NoUserException(String notification) {
        this.notification = notification;
    }

    @Override
    public String toString() {
        return "NoUserException{" +
                "notification='" + notification + '\'' +
                '}';
    }
}
