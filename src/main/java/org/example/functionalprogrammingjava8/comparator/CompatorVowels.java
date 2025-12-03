package org.example.functionalprogrammingjava8.comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BinaryOperator;

public class CompatorVowels {


    public static void main(String[] args) {

        Comparator<String> byConsonants = (x, y) -> removeVowels(x).compareTo(removeVowels(y));

        System.out.println(byConsonants.compare("Larry", "Libby"));


        Comparator<Integer> byIntCompareTo = (x, y) -> x.compareTo(y);

        System.out.println(byIntCompareTo.compare(1000, 1002));

        Comparator<Integer> byIntDifference = (x, y) -> x - y;
        System.out.println(byIntDifference.compare(1000, 1002));


        Comparator<String> natural = Comparator.naturalOrder();
        System.out.println(natural.compare("Larry", "Libby"));

        Comparator<String> reversed = Comparator.reverseOrder();
        System.out.println(reversed.compare("Larry", "Libby"));

        System.out.println(Comparator.nullsFirst(byConsonants).compare("Larry", null));

        System.out.println(Comparator.nullsLast(byConsonants).compare("Larry", null));

        System.out.println(byConsonants.reversed().compare("Larry", "Libby"));

        Student s1 = new Student("Larry", 1000, 3.82);
        Student s2 = new Student("Libby", 1001, 3.76);

        Comparator<Student> byNameConsonants = Comparator.comparing(x -> x.name, (x, y) -> removeVowels(x).compareTo(removeVowels(y)));
        System.out.println(byNameConsonants.compare(s1, s2));
        Comparator<Student> byConsonants2= Comparator.comparing(x -> x.name, (x,y)-> removeVowels(x).compareTo(removeVowels(y)));
        Comparator<Integer> byDifference = (x,y)-> x-y;
        Comparator<Double> byCeil= (x, y) -> (int) (Math.ceil(x)- Math.ceil(y));

        Student s3= new Student("Jean", 1003, 3.86);
        Student s4= new Student("Jen", 1005, 5.69);
        System.out.println("===================the thenComparing method accepts both a function and a\n" +
                "comparator and can be used to perform comparisons that are not in natural order.=======");

        System.out.println(byConsonants2.thenComparing(x->x.id, byDifference).thenComparing(x-> x.gpa, byCeil).compare(s3, s4));

        System.out.println("==============Using Comparators to Organize Maps==========");

        /**
         * Ce Comparator ne compare pas les chaînes telles quelles, mais compare leurs versions “sans voyelles”.
         *
         * "chicken" → "chckn"
         *
         * "cat" → "ct"
         *
         * "guinea pig" → "gn pg"
         *
         * "gerbil" → "grbl"
         */
        TreeMap<String,String> pets= new TreeMap<>(byConsonants);
        pets.put("gerbil", "small cut rodents");
        pets.put("guinea pig", "rodents, not pigs");
        pets.put("cat", "have nine lives");
        pets.put("chicken", "more populous than people");
        pets.forEach((x,y)-> System.out.println(x + " , " + y));



        System.out.println();
        /**
         * Ici on crée un Comparator pour comparer deux Entry en utilisant leurs clés
         * 👉 selon l’ordre naturel des String
         * 👉 pas selon l’ordre du TreeMap.
         */
        Comparator<Map.Entry<String, String>> cmap= Map.Entry.comparingByKey();
        Map.Entry<String,String> cat = pets.ceilingEntry("cat");
        Map.Entry<String,String> chicken= pets.ceilingEntry("chicken");
        System.out.println(cmap.compare(cat, chicken));

        /**
         * Dans ce TreeMap, l’ordre est :
         *
         * chicken
         *
         * cat
         *
         * guinea pig
         *
         * gerbil
         *
         * Donc :
         *
         * ceilingEntry("cat") → "cat"
         *
         * ceilingEntry("chicken") → "chicken"
         */

        System.out.println("============The comparingByKey method can also accept a comparator=========");

        Comparator<Map.Entry<String, String>> cmapCons= Map.Entry.comparingByKey(byConsonants);

        /**
         * Ici on compare les clés "cat" et "chicken"
         * selon l’ordre naturel ASCII/Unicode, pas selon l’ordre du TreeMap.
         * Dans l’ordre naturel :
         *
         * "cat" commence par 'c'
         *
         * "chicken" commence aussi par 'c'
         *
         * On compare ensuite 'a' vs 'h'
         *
         * calcul ASCII:
         * 'a' = 97
         * 'h' = 104
         * Difference = 97 − 104 = -7
         */
        System.out.println(cmapCons.compare(cat,chicken));

        System.out.println("=====Using Comparators in BinaryOperator Methods==============");
        Comparator<Integer> abscompare= Comparator.comparing(x-> Math.abs(x));
        BinaryOperator<Integer> bigint= BinaryOperator.maxBy(abscompare);
        BinaryOperator<Integer> smallint= BinaryOperator.minBy(abscompare);

        System.out.println(bigint.apply(2,-5));
        System.out.println(smallint.apply(2,-5));
    }



    //remove all vowels from a name
    public static String removeVowels(String s) {

        return s.replaceAll("[aeiou]", "");
    }
}
