package part2.section19_exception;

public class AccountException extends Exception {
    public AccountException() {

    }

    public AccountException(String message) {
        super(message);
    }

}
