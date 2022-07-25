package entities.concretes;


import entities.concretes.Customer;

import java.time.LocalDate;

public class CommercialActivities {

    private long id;
    private long customerId;
    private LocalDate startingDate;

    public CommercialActivities(Customer customer) {
        this.customerId = customer.getId();
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

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }
}
