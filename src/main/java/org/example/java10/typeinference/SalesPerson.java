package org.example.java10.typeinference;



public class SalesPerson extends Person {

    private String adresse;

    public SalesPerson() {

    }

    public SalesPerson(String name, int age, String adresse) {
        super(name, age);
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String toString() {

        return "SalesPerson[" + super.toString() + "]";
    }
}
