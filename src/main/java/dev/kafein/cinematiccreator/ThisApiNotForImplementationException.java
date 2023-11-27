package dev.kafein.cinematiccreator;

public final class ThisApiNotForImplementationException extends UnsupportedOperationException {
    private static final long serialVersionUID = 1908062917421246118L;

    public ThisApiNotForImplementationException() {
        super("This API is not for implementation.");
    }
}
