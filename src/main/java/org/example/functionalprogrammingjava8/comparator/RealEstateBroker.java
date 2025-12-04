package org.example.functionalprogrammingjava8.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


public class RealEstateBroker {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        List<Home> homes = List.of(
                new Home("Forest Acres", 425000.0, 4, 1.7, 5.1, 4.5),
                new Home("Happy Gardens", 510000.0, 4, 2.3, 5.1, 4.5),
                new Home("Comfy Condos", 190000.0, 2, 0.9, 2.1, 4.5),
                new Home("Comfy Condos", 190000.0, 2, 0.9, 0.7, 4.5),
                new Home("Happy Gardens", 470000.0, 4, 2.1, 5.1, 4.5),
                new Home("Forest Acres", 345000.0, 3, 1.5, 3.2, 5.9),
                new Home("Comfy Condos", 190000.0, 2, 0.3, 0.5, 2.4)
        );

        Map<Integer, Comparator<Home>> priorityMap = Map.of(
                0, Comparator.comparing(Home::getPrice),
                1, Comparator.comparingInt(Home::getNumBedrooms).reversed(),
                2, Comparator.comparingDouble(Home::getAcres),
                3, Comparator.comparingDouble(Home::getSchoolDistance),
                4, Comparator.comparingDouble(Home::getTrainDistance)
        );

        String community = askCommunity();
        List<Home> filtered = filterByCommunity(homes, community);

        System.out.println("Select three sort priorities (0–4):");

        Comparator<Home> comparator =
                priorityMap.get(askPriority())
                        .thenComparing(priorityMap.get(askPriority()))
                        .thenComparing(priorityMap.get(askPriority()));

        filtered.sort(comparator);
        filtered.forEach(System.out::println);
    }

    // --------------------------- Helpers --------------------------- //

    private static int askPriority() {
        int value;
        do {
            System.out.println("""
                    Select Priority:
                    0 - price
                    1 - bedrooms (desc)
                    2 - property size
                    3 - school distance
                    4 - train distance
                    """);
            value = safeIntInput();
        } while (value < 0 || value > 4);
        return value;
    }

    private static String askCommunity() {
        String[] options = {"Forest Acres", "Happy Gardens", "Comfy Condos", "any"};
        int choice;

        do {
            System.out.println("""
                    Select community:
                    0 - Forest Acres
                    1 - Happy Gardens
                    2 - Comfy Condos
                    3 - any
                    """);
            choice = safeIntInput();
        } while (choice < 0 || choice > 3);

        return options[choice];
    }

    private static List<Home> filterByCommunity(List<Home> homes, String community) {
        if ("any".equals(community)) {
            return new ArrayList<>(homes);
        }
        return homes.stream()
                .filter(h -> h.getCommunity().equals(community))
                .collect(Collectors.toList());
    }

    private static int safeIntInput() {
        while (true) {
            try {
                return Integer.parseInt(INPUT.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid number. Try again.");
            }
        }
    }
}

/*
public class RealEstateBroker {

    public static void main(String[] args) {

        List<Home> homes = Arrays.asList(
                new Home("Forest Acres", 425000.0, 4, 1.7, 5.1, 4.5),
                new Home("Happy Gardens", 510000.0, 4, 2.3, 5.1, 4.5),
                new Home("Comfy Condos", 190000.0, 2, 0.9, 2.1, 4.5),
                new Home("Comfy Condos", 190000.0, 2, 0.9, 0.7, 4.5),
                new Home("Happy Gardens", 470000.0, 4, 2.1, 5.1, 4.5),
                new Home("Forest Acres", 345000.0, 3, 1.5, 3.2, 5.9),
                new Home("Comfy Condos", 190000.0, 2, 0.3, 0.5, 2.4)
        );

        Comparator<Home> byPrice = Comparator.comparing(x -> x.price);
        Comparator<Home> byBedroomsAsc = Comparator.comparing(x -> x.numBedrooms);
        Comparator<Home> byBedroomsRev = byBedroomsAsc.reversed();

        Comparator<Home> byProperty = Comparator.comparing(x -> x.acres, (x, y) -> (int) (Math.ceil(y) - Math.ceil(y)));

        Comparator<Home> bySchool = Comparator.comparing(x -> x.schoolDistance, (x, y) -> (int) (Math.ceil(x) - Math.ceil(y)));

        Comparator<Home> byTrain = Comparator.comparing(x -> x.trainDistance, (x, y) -> (int) (Math.ceil(x) - Math.ceil(y)));

        Supplier<Integer> priorityNumber = () -> {

            Scanner input = new Scanner(System.in);
            int prio = -1;
            while (prio < 0 || prio > 4) {
                System.out.println("Select a Priority: ");
                System.out.println("0 - price: ");
                System.out.println("1 - number of bedrooms ");
                System.out.println(" 2 - property size");
                System.out.println(" 3 - distance to nearest  school");
                System.out.println(" 4 - distance to train station:");
                prio = Integer.parseInt(input.nextLine());

                if (prio < 0 || prio > 4) {
                    System.out.println("Invalid priority");
                }
            }
            return prio;
        };

        Supplier<String> comm = () -> {

            Scanner input = new Scanner(System.in);
            String[] communities = {" Forest Acres", "Happy Gardens", "Comfy Condos", "any"};

            int selction = -1;
            while (selction < 0 || selction > 3) {
                System.out.println("Select community: ");
                System.out.println("0 - Forest Acres ");
                System.out.println(" 1 - Happy Gardens ");
                System.out.println(" 2 - Comfy Condos");
                System.out.println(" 3 - any: ");

                selction = Integer.parseInt(input.nextLine());
                if ((selction < 0 || selction > 3)) {
                    System.out.println("Invalid community ");
                }
            }
            return communities[selction];
        };

        Supplier<Comparator<Home>> priority = () -> {
            Comparator<Home> pr;

            int prNumber = priorityNumber.get();
            switch (prNumber) {
                case 0:
                    pr = byPrice;
                    break;
                case 1:
                    pr = byBedroomsRev;
                    break;
                case 2:
                    pr = byProperty;
                    break;
                case 3:
                    pr = bySchool;
                    break;
                default:
                    pr = byTrain;
            }

            return pr;
        };


        Comparator<Home> priority1, priority2, priority3;
        String community = comm.get();

        List<Home> homeTemp = new ArrayList<>(homes);
        if (!community.equals("any")) {

            homeTemp.removeIf(x -> !x.community.equals(community));

            priority1 = priority.get();
            priority2 = priority.get();
            priority3 = priority.get();
            homeTemp.sort(priority1.thenComparing(priority2.thenComparing(priority3)));
            homeTemp.forEach(x -> System.out.println(x));
        }
    }

}*/
