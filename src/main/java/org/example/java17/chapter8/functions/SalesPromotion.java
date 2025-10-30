package org.example.java17.chapter8.functions;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.BiFunction;

public class SalesPromotion {

    final static Customer[] customers = {
            new Customer("John Smith", "9084321212", "football", "Giants", 3.61, null, 0, null),
            new Customer("Indira Patel", "7325551234", "tennis", null, 3.92, "Java", 0, null),
            new Customer("Sarah Johnson", "2123231245", "football", "Eagles", 3.71, null, 1, "Jane Hernadezs, 2017765765"),
            new Customer("Javier Jones", "8568768765", "golf", null, 3.85, "Physics", 1, "Maria Regina, 9086547654"),
            new Customer(null, null, "football", null, Double.MIN_VALUE, null, Integer.MAX_VALUE, null),
            new Customer(null, null, null, null, 3.75, null, Integer.MAX_VALUE, null),
            new Customer(null, null, null, null, Double.MAX_VALUE, null, 1, null)
    };

    private static void matchCustomer(Customer c, ArrayList<BiFunction<Customer, Integer, ? extends Record>> f) {

        for (int i = 0; i < f.size(); ++i) {
            Record record;
            int index = 0;

            do {
                record = f.get(i).apply(c, index);
                if (record != null) {
                    System.out.println(record);
                    index = record.index + 1;
                }

            } while (record != null);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BiFunction<Customer, Integer, SportRecord> fsport = (x, z) -> {

            SportRecord sportRecord = null;

            for (int i = z; i < customers.length && sportRecord == null; ++i) {

                if (Objects.equals(customers[i].sport,x.sport)) {
                    sportRecord = new SportRecord(customers[i].name, customers[i].phoneNum, i, customers[i].team);
                }
            }
            return sportRecord;
        };

        BiFunction<Customer, Integer, GpaRecord> fgpa = (x, z) -> {

            GpaRecord gpaRecord = null;
            for (int i = z; i < customers.length && gpaRecord == null; ++i) {

                if (customers[i].gpa >= x.gpa) {
                    gpaRecord = new GpaRecord(customers[i].name, customers[i].phoneNum, i, customers[i].subject);
                }
            }
            return gpaRecord;
        };

        BiFunction<Customer, Integer, FriendsRecord> ffriends = (x, z) -> {
            FriendsRecord friendsRecord = null;

            for (int i = z; i < customers.length && friendsRecord == null; ++i) {

                if (customers[i].numFriends >= x.numFriends) {

                    friendsRecord = new FriendsRecord(customers[i].name, customers[i].phoneNum, i, customers[i].friends);
                }

            }
            return friendsRecord;
        };


        ArrayList<BiFunction<Customer, Integer, ? extends Record>> list = new ArrayList<>();
        list.add(fsport);
        list.add(ffriends);
        list.add(fgpa);

        System.out.println(" SYNDAY FOOTBALL PROMOTION - Call the following customers: ");

        matchCustomer(new Customer(null, null, "football", null, Double.MAX_VALUE, null, Integer.MAX_VALUE, null), list);

        System.out.println(" TUESDAY HIGH-TECH PROMOTION - Call the following customers: ");
        matchCustomer(new Customer(null, null, null, null, 3.75, null, Integer.MAX_VALUE,null), list);

        System.out.println(" FRIDAY BRING A FRIEND PROMOTION - Call the following customers: ");
        matchCustomer(new Customer(null, null, null, null, Double.MAX_VALUE, null, 1, null), list);
    }
}
