package org.example.java9.collectionsAPiUpdate;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeDataGenerator {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "John Dee");
        Employee emp2 = new Employee(2, "Billal Hashni");
        Employee emp3 = new Employee(3, "Francis Cabrel");

        try(FileOutputStream fos = new FileOutputStream("emp.dat"); ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(emp1);
            oos.writeObject(emp2);
            oos.writeObject(emp3);
            System.out.println("Le fichier est généré avec succès.");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}
