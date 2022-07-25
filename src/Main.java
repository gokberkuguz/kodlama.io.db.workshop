import entities.concretes.Addresses;
import entities.concretes.Balance;
import entities.concretes.CorporateCustomer;
import entities.concretes.IndividualCustomer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        IndividualCustomer customer1 = new IndividualCustomer();
        customer1.setId(1);
        customer1.setCustomerNo("200");
        customer1.setName("Gokberk");
        customer1.setSurName("Uguz");
        customer1.setNationalId("1111");
        customer1.setChannel("Branch");

        CorporateCustomer customer2 = new CorporateCustomer();
        customer2.setId(2);
        customer2.setCustomerNo("201");
        customer2.setTitle("Gökberk Otomotiv");
        customer2.setTaxNo("2222");
        customer2.setChannel("Internet");

        Addresses addresses1 = new Addresses(customer1);
        addresses1.setId(1);
        addresses1.setName("Ev");
        addresses1.setLine("Oda");
        addresses1.setDistrict("Küçükçekmece");
        addresses1.setProvince("İstanbul");
        addresses1.setState("Türkiye");

        Balance balance1 = new Balance(customer1);
        balance1.setId(1);
        balance1.setBalanceDate(LocalDate.parse("16-01-2015"));
        balance1.setAmount(40000);



        System.out.println(addresses1.getCustomerID());
        System.out.println(balance1.getCustomerId());
        System.out.println(customer1.getChannel());
    }
}