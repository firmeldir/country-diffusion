package defusion;

import lombok.Data;

@Data
public class Account {

    private static final TRANSACTION_SUM_DIV = 1000; 
    
    private final Country country;
    private int balance = 0;
    private int transactionSum;

    void setTransactionSum() {
        transactionSum = balance / TRANSACTION_SUM_DIV;
    }

    public boolean nonEmpty() {
        return this.getBalance() == 0;
    }
}
