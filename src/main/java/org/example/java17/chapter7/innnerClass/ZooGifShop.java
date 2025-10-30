package org.example.java17.chapter7.innnerClass;

public class ZooGifShop {

    abstract  class SaleToDayOnly{

        abstract  int dollarOff();
    }

    public int addmission (int basePrice){
        SaleToDayOnly saleToDayOnly= new SaleToDayOnly() {     // déclaration classe anonyme
            @Override
            int dollarOff() {
                return 3;
            }
        };  // ne pas oublié le ; ici
        return basePrice - saleToDayOnly.dollarOff();
    }
}
