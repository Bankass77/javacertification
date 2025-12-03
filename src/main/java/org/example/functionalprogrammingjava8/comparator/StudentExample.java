package org.example.functionalprogrammingjava8.comparator;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class StudentExample {

    public static void main(String[] args) {

        System.out.println("=======================comparing with Function interface============");
        Function<Student, Double> gpaKey = x -> x.gpa;
        Comparator<Student> byGpa = Comparator.comparing(gpaKey);
        Student s1 = new Student("Larry", 1000, 3.82);
        Student s2 = new Student("Libby", 1001, 3.76);

        System.out.println(byGpa.compare(s1, s2));

        Comparator<Student> byGpa2 = Comparator.comparing(x -> x.gpa);

        System.out.println(byGpa2.compare(s1, s2));

        Comparator<Student> byId = Comparator.comparing(x -> x.id);
        System.out.println(byId.compare(s1, s2));
        Comparator<Student> byName = Comparator.comparing(x -> x.name);
        System.out.println(byName.compare(s1, s2));
        Comparator<Student> byGpaCeil = Comparator.comparing(x -> x.gpa, (x, y) -> (int) (Math.ceil(x) - Math.ceil(y)));
        System.out.println(byGpaCeil.compare(s1, s2));
        System.out.println("=======================comparingDouble============");
        ToDoubleFunction<Student> gpaKeyStudent = x -> x.gpa;
        System.out.println(Comparator.comparingDouble(gpaKeyStudent).compare(s1, s2));

        System.out.println("=======================comparingInt============");
        //System.out.println(Comparator.comparingInt(  x  -> x.id).compare(s1,s2)); // Error de compilation: il faut cast x avec Student
        System.out.println(Comparator.comparingInt((Student x) -> x.id).compare(s1, s2));
        ToIntFunction<Student> id = x -> x.id;
        System.out.println(Comparator.comparingInt(id).compare(s1, s2));

        System.out.println("===================Building Chains of Comparators: case two students with the same name and same grade=======");

        Student student1 = new Student("Joseph", 1000, 3.82);
        Student student2 = new Student("Joseph", 1002, 3.82);
        System.out.println(byName.compare(student1, student2));
        System.out.println(byName
                .thenComparing(byId)//byName->byId
                .thenComparing(byGpa)//byName->byId->byGpa
                .compare(student1, student2));

        System.out.println(byName.thenComparing(byGpa)
                .thenComparing(byId)
                .compare(student1, student2));

        System.out.println(byName.thenComparing(x -> x.gpa).thenComparing(x -> x.id).compare(student1, student2));

        System.out.println("====Specializing Comparator Chain components=====");
        Student s5 = new Student("Kaitlyn", 1006, 3.69);
        Student s6 = new Student("Jane", 1007, 3.69);
        System.out.println(byGpa.thenComparingInt(x -> x.id).compare(s5, s6));

        Student s7 = new Student("Robert", 1008, 3.86);
        Student s8 = new Student("Robert", 1009, 3.69);

        System.out.println(byName.thenComparingDouble(x -> x.gpa).compare(s7, s8));

        List<Student> students = Arrays.asList(new Student("Joseph", 1623, 3.54),
                new Student("Annie", 1923, 2.94),
                new Student("Sharmila", 1874, 1.86),
                new Student("Harvey", 1348, 1.78),
                new Student("Grace", 1004, 3.90),
                new Student("Annie", 1245, 2.87));

        System.out.println("==============Using Comparators to Sort Lists================");
        students.sort(byGpaCeil.thenComparing(x -> x.id)
                .thenComparing(x -> x.name));
        students.forEach(x -> System.out.println(x));

        System.out.println("=====Using Comparators to Sort Java Arrays====");

        Student[] students1 = {new Student("Joseph", 1623, 3.54),
                new Student("Annie", 1923, 2.94),
                new Student("Shramila", 1874, 1.86),
                new Student("Harvey", 1348, 1.78),
                new Student("Grace", 1004, 3.90),
                new Student("Annie", 1245, 2.87)};

        Arrays.sort(students1, byGpa.thenComparing(x -> x.id).thenComparing(x -> x.name));

        for (Student s : students1) {
            System.out.println(s);
        }

        System.out.println();
        Student[] studentsCopy = Arrays.copyOf(students1, students1.length);
        Arrays.sort(studentsCopy, 2, 5, Comparator.comparing(x -> x.name));

        for (Student s : studentsCopy) {
            System.out.println(s);
        }
        final int NUM_STUDENTS= 1000;
        NumberFormat fmt = NumberFormat.getCompactNumberInstance();
        fmt.setMaximumIntegerDigits(3);

        Student [] studentsBody= new Student[NUM_STUDENTS];
        for (int i = 0; i < NUM_STUDENTS; ++i) {
            studentsBody[i]= new Student("S"+ fmt.format(i),i, 0.0);
        }

        int index= Arrays.binarySearch(studentsBody, new Student("S647", 0, 0.0),
                Comparator.comparing(x->x.name));
        System.out.println("index = " + index + " " + studentsBody[index]);


    }
}

