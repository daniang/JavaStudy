package study.exception;

public class WarnErrorException extends RuntimeException {
    private static final long serialVersionUID = -6557136854913711234L;

    public WarnErrorException() {
    }

    public WarnErrorException(String message) {
        super(message);
    }

    public WarnErrorException(String message, ReflectiveOperationException e) {
        super(message, e.getCause());
    }
}

