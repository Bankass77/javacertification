package org.example.java17.records.records;

public class RecordExample {
    public static void main(String[] args) {
        var mommy= new Crane(4, "Cammy");
        System.out.println(mommy);
        System.out.println(mommy.name());
        System.out.println(mommy.numberEggs());

       // var mommy1 = new Crane("Crammy", 4) // Ne compile pas ordre des type a changé
        //var mommy2 = new Crane("Crammy") ; // ne compile pas, le nombre de paramètre attendu n'a pas été fourni

        var father  = new Crane(0, "Craig");
        System.out.println("Father is: " + father);

        var copy = new Crane(0, "Craig");
        System.out.println("Copy is: " + copy);
        System.out.println(copy.equals(father));
        System.out.println(father.hashCode() + ", " + copy.hashCode());

    }
}
