package org.example.java8.interfaces;

public interface Walk {
    public  default  int getSpeed(){
        return 5;
    }
}
