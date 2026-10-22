package bankmanagement;

import java.math.BigDecimal;

public class BankAccount {

    private final String holderName;
    private final int accountNumber;
    private BigDecimal balance;

    public BankAccount(String holderName, int accountNumber) {
        if (holderName == null || holderName.trim().isEmpty()) {
            throw new IllegalArgumentException("Account holder name cannot be empty.");
        }
        if (accountNumber <= 0) {
            throw new IllegalArgumentException("Account number must be positive.");
        }

        this.holderName = holderName.trim();
        this.accountNumber = accountNumber;
        this.balance = BigDecimal.ZERO;
    }

    public String getHolderName() {
        return holderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(BigDecimal amount) {
        validateAmount(amount);
        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        validateAmount(amount);
        if (amount.compareTo(balance) > 0) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance = balance.subtract(amount);
    }

    private void validateAmount(BigDecimal amount) {
        if (amount == null || amount.signum() <= 0) {
            throw new IllegalArgumentException("Amount must be positive.");
        }
        if (amount.scale() > 2) {
            throw new IllegalArgumentException("Amount cannot have more than two decimal places.");
        }
    }
}