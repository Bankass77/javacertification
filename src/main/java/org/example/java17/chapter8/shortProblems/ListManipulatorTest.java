package org.example.java17.chapter8.shortProblems;

import java.util.ArrayList;
import java.util.List;

public class ListManipulatorTest {

    public static void main(String[] args) {
        ListManipulator<String> sListAdd = new ListManipulator<String>() {
            @Override
            public void manipulate(final List<String> values, final String integer) {
                values.add(integer);
            }
        };


        ListManipulator<Integer> iListAdd = new ListManipulator<Integer>() {
            @Override
            public void manipulate(final List<Integer> values, final Integer integer) {
                values.add(integer);
            }

            @Override
            public List<Integer> create() {
                return new ArrayList<>(50);
            }
        };

        ListManipulator<Integer> iListRmv = new ListManipulator<Integer>() {
            @Override
            public void manipulate(final List<Integer> values, final Integer integer) {
                values.remove(integer);
            }

            @Override
            public List<Integer> create() {
                return new ArrayList<>(50);
            }
        };

        System.out.println("=============SListAdd(String)================");

        List<String> stringList= sListAdd.create();
         sListAdd.manipulate(stringList, "Java");
         sListAdd.manipulate(stringList, "17");
         System.out.println("Liste String: "+ stringList );


        System.out.println("=============iListAdd(Integer)================");

        List<Integer> integerList = iListAdd.create();
        iListAdd.manipulate(integerList, 45);
        iListAdd.manipulate(integerList, 65);
        System.out.println("Liste Integer: "+ integerList);

        System.out.println("=============iListRmv(Integer)================");

        iListRmv.manipulate(integerList, 45);
        System.out.println("Liste Integer remove: "+ integerList);
    }
}
