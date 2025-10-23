package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customers customers = new Customers(5);
        Customer sander = new Customer("Sander", "Sander", 5, PowerAgreementType.SPOTPRICE);
        Customer teo = new Customer("Teodor", "Teodor", 7, PowerAgreementType.NORGESPRICE);
        customers.addCustomer(sander);
        customers.addCustomer(teo);
        //System.out.println(customers.getCustomer(5));
        //System.out.println(customers.getCustomer(7));
        //customers.printCustomers();

        for (Customer a : customers.getCustomers()) {
            System.out.println(a);
        }

    }
}
