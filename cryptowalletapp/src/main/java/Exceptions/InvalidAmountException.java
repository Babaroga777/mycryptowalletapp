package Exceptions;

public class InvalidAmountException extends Exception {
    public InvalidAmountException() {
        super("Invalid amount < 0!");
    }
}
