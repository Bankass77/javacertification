package org.example.java8.interfaces;

public interface Hop {

    static  int getJumpHeigth(){  // par defaut le compilateur va insrér public comme modificateur, puis la méthode est déclarée static
        return 8;
    }
}
