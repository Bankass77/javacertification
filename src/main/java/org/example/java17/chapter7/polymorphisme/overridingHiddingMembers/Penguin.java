package org.example.java17.chapter7.polymorphisme.overridingHiddingMembers;

public class Penguin {
    public static int getHeight() {
        return 3;
    }

    public void printInfo() {
        System.out.println(this.getHeight());
    }
}
