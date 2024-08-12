package org.example.java9.ObjectInputFilter;



import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.example.java9.collectionsAPiUpdate.Employee;

/**
 * L'interface ObjectInputFilter a été introduite dans Java 9 pour améliorer la sécurité des opérations de désérialisation.
 * Elle permet de définir des filtres pour contrôler quelles classes et types d'objets peuvent être désérialisés,
 * aidant ainsi à prévenir les attaques par désérialisation malveillante.
 * Cette classe Utilise un filtre par défaut pour un ObjectInputStream
 */
public class FilteringDeserialization {

    public static void main(String[] args) throws IOException {
        filteringByClass();
        filteringByMethod();
    }

    // filtering the de-serialization by invoking the filter class
    private static void filteringByClass() throws IOException {
        FileInputStream is = new FileInputStream("src/main/resources/emp.dat");
        try(ObjectInputStream ois = new ObjectInputStream(is)) {
            ois.setObjectInputFilter(new FilterEmployee());
            try {

                Employee employee = (Employee) ois.readObject();
                System.out.println("Employe object after applying filter: " + "\n" + employee);
            } catch(ClassNotFoundException e) {
                System.out.println("Cannot deserialize ");
            }
        }
    }

    // filtering the de-serialization by invoking the method
    private static void filteringByMethod() throws IOException {
        FileInputStream is = new FileInputStream("src/main/resources/emp.dat");
        try(ObjectInputStream ois = new ObjectInputStream(is)) {
            ois.setObjectInputFilter(FilterEmployeeByPackage::empFilter);

            Employee employee = (Employee) ois.readObject();
            System.out.println("Employe object after applying filter: " + "\n" + employee);
            System.out.println(employee);
        } catch(ClassNotFoundException e) {
            System.out.println("Cannot deserialize ");
        }
    }

}
