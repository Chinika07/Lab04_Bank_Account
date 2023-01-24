import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(
                "Chinika",
                "Smith",
                LocalDate.of(99, 11, 07),
                123456,
                100000

        );
        System.out.println(bankAccount.getLastName());

        bankAccount.deposit(1000);
        System.out.println("New balance: " + bankAccount.getBalance());

        bankAccount.withdrawal(500);
        System.out.println("New Current balance: " + bankAccount.getBalance());
    }


}
