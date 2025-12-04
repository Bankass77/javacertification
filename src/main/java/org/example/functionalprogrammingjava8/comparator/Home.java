package org.example.functionalprogrammingjava8.comparator;

public class Home {

    private String community;
    private double price;
    private int numBedrooms;
    private double acres;
    private double schoolDistance;
    private double trainDistance;

    public Home(String community, double price, int numBedrooms,
                double acres, double schoolDistance, double trainDistance) {
        this.community = community;
        this.price = price;
        this.numBedrooms = numBedrooms;
        this.acres = acres;
        this.schoolDistance = schoolDistance;
        this.trainDistance = trainDistance;
    }

    public String getCommunity() {
        return community;
    }

    public double getPrice() {
        return price;
    }

    public int getNumBedrooms() {
        return numBedrooms;
    }

    public double getAcres() {
        return acres;
    }

    public double getSchoolDistance() {
        return schoolDistance;
    }

    public double getTrainDistance() {
        return trainDistance;
    }

    @Override
    public String toString() {
        return numBedrooms + " bedroom house in " + community + " for $" + price +
                " on " + acres + " acres\n" +
                schoolDistance + " miles from school " +
                trainDistance + " miles from train";
    }
}

