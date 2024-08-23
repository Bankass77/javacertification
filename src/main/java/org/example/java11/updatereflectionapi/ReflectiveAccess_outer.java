package org.example.java11.updatereflectionapi;


import java.lang.reflect.Field;

// Cette classe permet d'accéder aux éléments qui sont déclarés private en utilisant la reflection
// ici la valeur de la propriété value est modifiée en utilisant la reflection
//avant java 11 on ne pouvait pas accédé à un membre declaré private par la reflection.
public class ReflectiveAccess_outer {
    private static int value = 10;

    public static class ReflectiveAccess_Inner {
        public static void changeIt() throws Exception {
            Field field = ReflectiveAccess_outer.class.getDeclaredField("value");
            field.setInt(field, 20);
            System.out.println("Valuer modifié de value :" + value);
        }
    }

    public static void main(String[] args) throws Exception {
        ReflectiveAccess_Inner.changeIt();
    }
}
