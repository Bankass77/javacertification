package org.example.functionalprogrammingjava8.collections.problem;

public class Book {
    String author;
    double price;
    int numberOfCopies;

    public Book(final String author, final double price, final int numberOfCopies) {
        this.author = author;
        this.price = price;
        this.numberOfCopies = numberOfCopies;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }


    @Override
    public String toString() {
        return author + ", $" + price + ", Number of copies: " + numberOfCopies;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    public void setNumberOfCopies(final int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public void setPrice(final double v) {

    }
}
