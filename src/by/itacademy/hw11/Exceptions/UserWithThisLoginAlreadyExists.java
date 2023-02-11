package src.by.itacademy.hw11.Exceptions;

public class UserWithThisLoginAlreadyExists extends RuntimeException{
    public UserWithThisLoginAlreadyExists(String message) {
        super(message);
    }
}
