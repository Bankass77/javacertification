package org.example.java17.chapter7.polymorphisme.overridingHiddingMembers;

public class CrestedPenguin extends Penguin{

    public  static  int getHeight(){
        return 8;
    }

    public static void main(String[] args) {
        new CrestedPenguin().printInfo();
    }
}
