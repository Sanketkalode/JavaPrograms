package designPattern.builderPattern;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author SanketKalode
 * @date 16-03-2024
 */
public class BankAccountBuilder {
    private int accountId = -1;
    private String accountHolderName = "";
    private BigDecimal balance = BigDecimal.ZERO;
    private LocalDateTime dateOfJoining = null;

    public BankAccountBuilder setAccountId(int accountId) {
        this.accountId = accountId;
        return this;
    }

    public BankAccountBuilder setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        return this;
    }

    public BankAccountBuilder setBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    public BankAccountBuilder setDateOfJoining(LocalDateTime dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
        return this;
    }

    public BankAccount build(){
        BankAccount bankAccount = new BankAccount(accountId,accountHolderName,balance,dateOfJoining);
        accountId = -1;
        accountHolderName = "";
        balance = BigDecimal.ZERO;
        dateOfJoining = null;
        return bankAccount;
    }
}
