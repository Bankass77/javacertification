package org.example.java17.chapter8;

public interface Sleep {  // n'est pas une interface fonctionnelle, car ne contient pas de méthode abstracte
    private  void snore(){}
    default int getZzz(){return 1;}
}
