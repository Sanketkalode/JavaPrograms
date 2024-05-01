package designPattern.builderPattern;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author SanketKalode
 * @date 16-03-2024
 */
public class BankAccount {

    private int accountId;
    private String accountHolderName;
    private BigDecimal balance;
    private LocalDateTime dateOfJoining;

    public BankAccount(int accountId, String accountHolderName, BigDecimal balance, LocalDateTime dateOfJoining) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.dateOfJoining = dateOfJoining;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public LocalDateTime getDateOfJoining() {
        return dateOfJoining;
    }

    public void display(){
        if(!accountHolderName.isEmpty()){
            System.out.println("Account Holder: "+accountHolderName);
        }
        if (balance.intValue() > 0){
            System.out.println("Balance: "+balance);
        }
        if (dateOfJoining != null){
            System.out.println("Date of account opening: "+dateOfJoining);
        }
    }
}
