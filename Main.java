public class Main {

    public static String accountName = "Natali";
    public static int amount = 5000;

    public static void main(String[] args) {
        try {
            System.out.println("Остаток после снятия 1000: " + deduct("Natali", 1000)); // Успешное снятие
            System.out.println("Остаток после снятия 6000: " + deduct("Natali", 6000)); // Ошибка: недостаточно средств
        } catch (InsufficientAmountException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (AccessDeniedException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            System.out.println("Остаток после попытки снять с чужого аккаунта: " + deduct("AnotherAcc", 500));
        } catch (InsufficientAmountException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (AccessDeniedException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int deduct(String accountToProcess, int amtToCacheOut) throws InsufficientAmountException {
        if (!accountName.equals(accountToProcess)) {
            throw new AccessDeniedException("Имя аккаунта не совпадает");
        }
        if (amount < amtToCacheOut) {
            throw new InsufficientAmountException("Недостаточно средств для снятия " + amtToCacheOut);
        }

        amount = amount - amtToCacheOut;
        return amount;
    }
}
