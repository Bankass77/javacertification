package org.example.java9.privateMethodeInterface;

import java.io.FileInputStream;
import java.io.IOException;

public interface PrivateMethodInterface {

    // First default method
    default void method() {
        System.out.println("In method 1");

        try {
            utilResource();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    // Second default method
    default void method2() {

        System.out.println("In method 2");
        try {

            utilResource();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static void utilResource() throws IOException {
        System.out.println("==Reading Common resources ===");

        try(FileInputStream fis = new FileInputStream("src/main/resources/data.dat")) {
            while(fis.read() != -1) {
                System.out.println(fis.read());
            }
        }
    }
}
