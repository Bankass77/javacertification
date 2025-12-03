package org.example.functionalprogrammingjava8.collections.problem;

import java.util.Map;
import java.util.TreeMap;

public class DictionaryDefinitionSpanish {

    public static void main(String[] args) {

        Map<String, String> spanish = new TreeMap<>();

        spanish.put("automobile", "ground-powered vehicule with wheels");
        spanish.put("boat", "vehicle that travels on water");
        spanish.put("airplane", "powered vehicule that flies");

        spanish.merge("automobile", "vehiculo tierra-accionado con las ruedas", (oldValue, newValue) -> newValue);
        spanish.merge("boat", "vehiculo que viaja en el agua", (oldValue, newValue) -> newValue);
        spanish.merge("airplane", "vehiculo motorizado que vuela", (oldValue, newValue) -> newValue);

        spanish.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
