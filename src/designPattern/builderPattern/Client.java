package designPattern.builderPattern;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author SanketKalode
 * @date 16-03-2024
 */
public class Client {
    public static void main(String[] args) {
        BankAccountBuilder builder = new BankAccountBuilder();
        BankAccount bankAccount = builder
                .setAccountHolderName("Monkey D Luffy")
                .setBalance(BigDecimal.valueOf(3000000))
                .setDateOfJoining(LocalDateTime.now()).build();

        bankAccount.display();
    }
}
