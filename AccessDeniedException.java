// Класс для обработки исключения доступа
class AccessDeniedException extends RuntimeException {
    public AccessDeniedException() {
    }

    public AccessDeniedException(String message) {
        super(message);
    }
}
