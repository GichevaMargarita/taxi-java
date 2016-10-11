package by.gicheva.taxipark.exception;

public class NoSuitableAutoException extends Exception {
    public NoSuitableAutoException() {
    }

    public NoSuitableAutoException(String message) {
        super(message);
    }

    public NoSuitableAutoException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuitableAutoException(Throwable cause) {
        super(cause);
    }

    public NoSuitableAutoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
