package part2.section19_exception;

public class UserPasswordException extends Exception {
    public UserPasswordException() {
    }

    public UserPasswordException(String message) {
        super(message);
    }
}
