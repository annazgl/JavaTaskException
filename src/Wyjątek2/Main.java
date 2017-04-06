package Wyjątek2;

public class Main {
    //Stwórz konto bankowe z metodami deposit, withdraw, konstruktorem. Metoda withdraw powinna obsługiwać własny
    // wyjątek InsufficientFundsException.

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        BankAccount bankAccount = new BankAccount(new Person("Adam", "Kowalski"), "84 1010 4344 4343 6566 6565 5455");
        bankAccount.deposit(2000);
        bankAccount.deposit(1000);

        try {
            bankAccount.withdraw(3100);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        bankAccount.deposit(2000);

        try {
            bankAccount.withdraw(100);
        } catch (InsufficientFundsException e) {
            System.out.println();
        }
        System.out.println("Ilość środków na koncie to " +bankAccount.getFunds());
    }
}