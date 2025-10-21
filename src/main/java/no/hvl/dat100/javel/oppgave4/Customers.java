package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {

        this.customers = new Customer[size];

    }

    // b) count number of non-null references
    public int countNonNull() {


        int count = 0;

        for  (Customer customer : this.customers) {
            if (customer != null) {
                count++;
            }
        }

        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        boolean funnet = false;
        Customer c = null;

        for (Customer customer : this.customers) {
            if (customer.getCustomerID() == customer_id) {
                funnet = true;
                c = customer;
                break;
            }
        }

        return c;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        boolean inserted = false;

        for (int j = 0; j < customers.length; j++) {
            if (customers[j] == null) {
                customers[j] = c;
                inserted = true;
                break;
            }
        }

        return inserted;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        boolean deleted = false;
        Customer c = null;

        // TODO

        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        Customer[] customers = null;

        // TODO

        return customers;
    }

    public void printCustomers() {
        for (Customer customer : this.customers) {
            System.out.println(customer);
        }
    }
}