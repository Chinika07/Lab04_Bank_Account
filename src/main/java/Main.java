import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(
                "Chinika",
                "Smith",
                LocalDate.of(99, 11, 07),
                188978,
                1000

        );

        System.out.println("First Name: " + bankAccount.getFirstName());
        System.out.println("Second Name: " + bankAccount.getLastName());
        System.out.println("Date of Birth:" + bankAccount.getDateOfBirth());
        System.out.println("Account Number: "+ bankAccount.getAccountNumber());
        System.out.println("Current Balance: " + bankAccount.getBalance());


        bankAccount.deposit(120);
        System.out.println("New Balance: " + bankAccount.getBalance());

        bankAccount.withdrawal(500);
        System.out.println("Current Balance: " + bankAccount.getBalance());

//        Interest rate:
//        bankAccount.interest(7);
//        System.out.println("Interest : " + bankAccount.getInterest());
    }

}
