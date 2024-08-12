package org.example.java10.typeinference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.logging.Logger;

import org.example.java9.collectionsAPiUpdate.Employee;

/**
 * Utilisation basic du keyword var
 */
public class TypeInferenceDemo_Basic {

    private static final Logger logger = Logger.getLogger(TypeInferenceDemo_Basic.class.getName());

    public static void main(String[] args) {
        // le type de x est déduit comme étant un int
        var x = 10;

        logger.info("x =" + x);
        var message = "Java is simple to learn";
        logger.info("message = " + message);
        var employee = new Employee();
        logger.info("employee = " + employee);

        var myIntegerList = getList();  // le type de myIntegerList est déduit selon le type de retour de la méthode getList()
        logger.info("myIntegerList = " + myIntegerList);
        // la déduction du type avec Les expressions Lambda
        Function<Integer, Integer> process = value -> value * 2;
        var data = process.apply(30);

        logger.info("data = " + data);

        //Déclaration du types d'une collection
        var list = new ArrayList<>();
        logger.info("list = " + list);
    }

    private static List<Integer> getList() {
        return Arrays.asList(43, 54, 12, 53);
    }
}
