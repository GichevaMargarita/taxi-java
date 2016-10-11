package by.gicheva.taxipark.exception;

public class NoInputFileException extends Exception {
    public NoInputFileException() {
    }

    public NoInputFileException(String message) {
        super(message);
    }

    public NoInputFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoInputFileException(Throwable cause) {
        super(cause);
    }
}
