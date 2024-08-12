package org.example.lambda;

import org.example.InterfaceFunctionel.Sprint;

public class Tiger implements Sprint {

    @Override
    public void print(int speed) {
  System.out.println("Animal is printing fast" + " " + speed);
    }
}
