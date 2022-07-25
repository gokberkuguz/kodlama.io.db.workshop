package entities.concretes;

import entities.concretes.Customer;

public class Channels {
    private long customerId;
    private String channelName;//set internet or branch

    public Channels(Customer customer) {
        this.customerId = customer.getId();
        this.channelName = customer.getChannel();
    }

    public long getCustomerId() {
        return customerId;
    }

    public String getChannelName() {
        return channelName;
    }

}
