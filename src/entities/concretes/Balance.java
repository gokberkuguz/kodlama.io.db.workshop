package entities.concretes;

import entities.concretes.Customer;

import java.time.LocalDate;

public class Balance {
    private long id;
    private long customerId;
    private LocalDate balanceDate;
    private long amount;

    public Balance(Customer customer) {
        this.customerId =customer.getId();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCustomerId() {
        return customerId;
    }

    public LocalDate getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(LocalDate balanceDate) {
        this.balanceDate = balanceDate;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
