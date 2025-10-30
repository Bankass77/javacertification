package org.example.java17.chapter7.polymorphisme.overridingHiddingMembers;

public class Kangoroo extends Marsupial{

    protected  int age= 6;

    public static boolean isBiped(){
        return  true;
    }

    public static void main(String[] args) {

        Kangoroo joey= new Kangoroo();
        Marsupial moey= joey;
        System.out.println(joey.isBiped());
        System.out.println(moey.isBiped());
        System.out.println(joey.age);
        System.out.println(moey.age);
    }
}
