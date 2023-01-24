import java.time.LocalDate;

public class BankAccount {

    // Properties
    public String firstName;
    public String lastName;
    public LocalDate dateOfBirth;
    public Integer accountNumber;
    public Integer balance;

    // Constructor
    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, Integer accountNumber,
                       Integer balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = 0;
        this.balance = 120;

    }

    // Behaviours/ Methods

    // accept an amount as deposit

    // Add to balance

    public void deposit(Integer amountDeposited) {
        balance += amountDeposited;
        System.out.println("Deposited balance: " + amountDeposited);
    }
    public Integer getCurrentBalance() {
        return balance;
    }

    // Withdrawal

    public void withdrawal(Integer amountWithdrawn) {
        balance -= amountWithdrawn;
        System.out.println("Amount withdrawn: " + amountWithdrawn);
    }
    public Integer getNewBalance() {
        return balance;
    }

    // Getters & Setters

    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public LocalDate getDateOfBirth() { return this.dateOfBirth; }
    public int getAccountNumber () { return this.accountNumber; }
    public int getBalance () { return this.balance; }





}
