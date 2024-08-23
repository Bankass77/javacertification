package org.example.java11.nestBasedAccessControl;


import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Gestion de la visibilité des attributs des classes imbriquées depuis java 11
 */
public class ReflectionApiDemo {
    public static void main(String[] args) {

        Car car = new Car("Diesel");
        Car.Engine engine = car.new Engine();
        System.out.println("Host name for Engine class:" + hostName(engine));
        if (checkNestMate(engine) == true) {
            System.out.println("Engine is nestmate of car");
        } else {
            System.out.println("Engine is not nestmate of car");

        }
        Set<String> nestMembers = findNestMembers(engine);
        System.out.println("Nestmembers of  Engine are: ==>");
        int counter = 0;
        for (String nestMember : nestMembers) {
            System.out.println(++counter + "." + nestMember + " ");
        }
    }

    /**
     * @param o is InstanceOf Engine
     * @return An array of the Class objects, which is a group of all the classes and
     * interfaces which are nest members of the current class.
     * Along with the nest members, this array also contains the nest host of
     * the given class. As it is denoted as the nest host of itself. This class is
     * always placed at the first element of the array which is followed by
     * other classes or interfaces present within it.
     * If the class does not contain any nest members, the method returns only
     * this.
     * getNestMembers()
     * This method is used to find the other nest members of the given nest host.
     */
    private static Set<String> findNestMembers(Object o) {
        return Arrays.stream(o.getClass().getNestMembers()).map(Class::getName).collect(Collectors.toSet());
    }

    /**
     * @param o is InstanceOf Engine
     * @return true or false if the current class and the Class<?> are members or not of the same out class or the members of the same nest host.>
     */
    private static boolean checkNestMate(Object o) {
        return o.getClass().isNestmateOf(Car.class);
    }

    /**
     * The getNestHost() method is used to get the details of the host class inside
     * which the nest class is embedded. Even if your class is contained within an
     * interface, this method will get the interface details.
     *
     * @param o is InstanceOf Engine
     * @return the nest host class or interface
     */
    private static String hostName(Object o) {
        return o.getClass().getNestHost().getName();
    }

}
