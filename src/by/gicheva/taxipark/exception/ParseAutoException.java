package by.gicheva.taxipark.exception;

public class ParseAutoException extends Exception {

    public ParseAutoException() {
    }

    public ParseAutoException(String message) {
        super(message);
    }

    public ParseAutoException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParseAutoException(Throwable cause) {
        super(cause);
    }

    public ParseAutoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
