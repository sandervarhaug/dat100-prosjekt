package no.hvl.dat100.javel.oppgave3;

public class Customer {

    private String name;
    private String email;
    private int customerID;
    private PowerAgreementType powerAgreement;



    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {

        this.name = name;
        this.email = email;
        this.customerID = customer_id;
        this.powerAgreement = agreement;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getCustomerID() {
        return customerID;
    }

    public PowerAgreementType getPowerAgreement() {
        return powerAgreement;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public void setPowerAgreement(PowerAgreementType powerAgreement) {
        this.powerAgreement = powerAgreement;
    }

    @Override
    public String toString() {
        return "Customer number: " + customerID + ", name: " + name + ", email: " + email + ", agreement: " + powerAgreement;
    }
}
