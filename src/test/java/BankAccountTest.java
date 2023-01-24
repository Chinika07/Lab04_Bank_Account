import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount(
                bankAccount.getFirstName(),
                bankAccount.getLastName(),
                bankAccount.getDateOfBirth(),
                bankAccount.getAccountNumber(),
                bankAccount.getBalance());
    }

    @Test
    void myFirsTest() {
        assertThat(1).isEqualTo(1);
    }


//    BankAccountTest deposit;
//    @BeforeEach
//    void setUp() {
//    deposit = new BankAccountTest();
//    }

//   @Test
//    void canDeposit() {
//        var deposit = new BankAccount();
//        assertThat(deposit.add(3, 2)).isEqualTo(5L);
//    }
//
//    @Test
//    void canWithdraw() {
//        var withdraw = new BankAccount();
//        assertThat(withdraw.subtract(4L, 3L)).isEqualTo(1L);
//    }
//
//    @Test
//    void canSumArray() {
//        Long[] arr = {555L, 172L, 282L};
//        BankAccount balance = new BankAccount();
//        assertThat(balance.canSumArray(arr)).isEqualTo(1572L);
//    }
//
}


