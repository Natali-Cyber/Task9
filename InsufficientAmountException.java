// Класс для обработки исключения недостатка средств
class InsufficientAmountException extends Exception {
    public InsufficientAmountException() {
    }

    public InsufficientAmountException(String message) {
        super(message);
    }
}