package org.example.java17.chapter8;
// pas une interface fonctionnelle, car public  boolean equals( Hiberante o); prend pas Object comme paramètre de equals
public interface Hiberante {
    String toString();
    public  boolean equals( Hiberante o);

    public  abstract  int hashCode(); //
    public  void rest();
}
