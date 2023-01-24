import java.time.LocalDate;

public class BankAccount {


    // Properties
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private Integer accountNumber;
    private Integer balance;

    // Constructor
    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, Integer accountNumber,
                       Integer balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    // Getters & Setters

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }


    // Behaviours/ Methods

    // 1. Accept an amount as deposit

    // 2. Add to balance

    public void deposit(Integer amountDeposited) {
        balance += amountDeposited;
        System.out.println("Deposited Amount: " + amountDeposited);
    }

    public Integer getCurrentBalance() {
        return balance;
    }

    // Withdrawal

    // 1. Accept an amount to be withdrawn

    // 2. Subtract from balance

    public void withdrawal(Integer amountWithdrawn) {
        balance -= amountWithdrawn;
        System.out.println("Amount Withdrawn: " + amountWithdrawn);
    }

    public Integer getNewBalance() {
        return balance;
    }

    // Interest rate section (?)

//    public void interest(Integer interestRate) {
//        balance * interestRate * 2 / 100 // 2 is the time period
//        System.out.println("Interest Rate: " + interestRate);
//    }
//    public Integer getInterest() {
//        return balance;
//    }

    //    Part of Testing section
//    Long sumArray(Long[] numbers) {
//        Long sum = 0L;
//
//        for (var num : numbers) {
//            sum += num;
//
//        }
//        return sum;
//    }
}



