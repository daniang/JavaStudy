package study.exception;

public class SystemInnerException extends RuntimeException {
    private static final long serialVersionUID = -4241069198209638147L;

    public SystemInnerException() {
    }

    public SystemInnerException(String message) {
        super(message);
    }

    public SystemInnerException(String message, ReflectiveOperationException e) {
        super(message, e.getCause());
    }
}
