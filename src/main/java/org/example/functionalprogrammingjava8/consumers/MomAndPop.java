package org.example.functionalprogrammingjava8.consumers;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MomAndPop implements Iterable<Employee> {
    // NUM_EXERCS correspond au nombre d’employés “exceptionnels” (le CEO et le VP) avant les listes.
    // C’est une manière d’indiquer que :Les deux premiers éléments de l’itération ne sont pas dans les listes,
    // donc il faut “sauter” ces deux positions quand on accède aux listes.

    static int NUM_EXERCS = 2;
    static double profit;
    Employee ceo;
    Employee vicePresident;
    List<Employee> districtsManagers;
    List<Employee> programmers;

    public MomAndPop() {

        ceo = new Employee("Mr. Bucks", 1000000.0, 75000.0, 0.15);
        vicePresident = new Employee("Highly Mobile", 750000.0, 250000.0, 0.15);

        districtsManagers = Arrays.asList(
                new Employee("Joe Jognston", 2000000.0, 10000.0, 0.15),

                new Employee(" Sarah Smith", 210000.0, 9000.0, 0.15));

        programmers = Arrays.asList(
                new Employee("Javier Rodriguez", 150000.0, 2000.0, 0.10),
                new Employee("Kalpana Patel", 155000.0, 1500.0, 0.10),
                new Employee("Cyndy Altavera", 140000.0, 12000.0, 0.10),
                new Employee("Sam Jones", 130000.0, 1300.0, 0.10));
    }

    @Override
    public Iterator<Employee> iterator() {
        return new EmployeeIterator();
    }

    private class EmployeeIterator implements Iterator<Employee> {

        private int cursor;  //cursor représente la position actuelle
        private final int limit;

        public EmployeeIterator() {
            this.cursor = 0;

            limit = NUM_EXERCS + districtsManagers.size() + programmers.size();
        }

        @Override
        public boolean hasNext() {

            return cursor < limit;
        }

        @Override
        public Employee next() {

            Employee emp = null;

            if (hasNext()) {
                if (cursor == 0) {
                    emp = ceo;
                }

                if (cursor == 1) {
                    emp = vicePresident;
                }

                //La condition devrait vérifier que le curseur est au moins égal à NUM_EXERCS avant de parcourir les managers.
                if (cursor >= NUM_EXERCS && cursor < (NUM_EXERCS + districtsManagers.size())) {
                    emp = districtsManagers.get(cursor - NUM_EXERCS);
                }

                //La condition devrait vérifier que le curseur est au moins égal à NUM_EXERCS + taille des managers avant de parcourir les programmers.
                if (cursor >= NUM_EXERCS + districtsManagers.size() && cursor < (NUM_EXERCS + districtsManagers.size() + programmers.size())) {

                    emp = programmers.get(cursor - NUM_EXERCS - districtsManagers.size());

                }

                cursor++;
            }
            return emp;
        }
    }
}
