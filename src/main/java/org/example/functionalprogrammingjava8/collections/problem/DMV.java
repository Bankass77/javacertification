package org.example.functionalprogrammingjava8.collections.problem;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.function.*;

public class DMV {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to the Department of Motor Vehicles.");

        Map<String, Licence> licences = new TreeMap<>();

        // -------------------- Suppliers --------------------
        Supplier<String> licenceId = () -> {
            System.out.print("Enter licence ID: ");
            return scanner.nextLine().trim();
        };

        Supplier<String> insurance = () -> {
            System.out.print("Enter insurance: ");
            return scanner.nextLine().trim();
        };

        Supplier<LocalDate> expDate = () -> {
            System.out.print("Enter year: ");
            int year = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter month (e.g. JANUARY): ");
            Month month = Month.valueOf(scanner.nextLine().trim().toUpperCase());

            System.out.print("Enter day: ");
            int day = Integer.parseInt(scanner.nextLine());

            return LocalDate.of(year, month, day);
        };

        Supplier<Vehicule> vehiculeSupplier = () -> {
            System.out.print("Enter make: ");
            String make = scanner.nextLine();
            System.out.print("Enter model: ");
            String model = scanner.nextLine();
            System.out.print("Enter year: ");
            int year = Integer.parseInt(scanner.nextLine());
            return new Vehicule(make, model, year);
        };

        Supplier<Integer> selectedOperation = () -> {
            System.out.println("""
                    
                    Select an Operation:
                    0 - Add Driver
                    1 - Remove Driver
                    2 - Change Insurance
                    3 - Suspend Licence
                    4 - Renew Licence
                    5 - Add Vehicle
                    6 - Remove Vehicle
                    7 - Quit
                    """);

            int choice;


            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                return -1;
            }

            return choice;
        };

        // -------------------- BiFunctions centralisés --------------------

        // Add driver (do nothing if exists)
        BiFunction<Licence, Licence, Licence> addDriver = (oldV, newV) -> oldV;

        // Remove driver
        BiFunction<String, Licence, Licence> removeDriver = (k, v) -> null;

        // Change insurance
        BiFunction<Licence, Licence, Licence> changeInsurance =
                (ov, nv) -> new Licence(ov.expdate, nv.insurance, ov.status, ov.vehicules);

        // Suspend licence
        BiFunction<String, Licence, Licence> suspendLicence =
                (k, v) -> new Licence(v.expdate, v.insurance, STATUS.SUSPENDED, v.vehicules);

        // Renew licence
        BiFunction<Licence, Licence, Licence> renewLicence =
                (ov, nv) -> new Licence(nv.expdate, ov.insurance, STATUS.ACTIVE, ov.vehicules);

        // Add vehicle
        BiFunction<Licence, Licence, Licence> addVehicule =
                (ov, nv) -> {
                    Licence clone = new Licence(ov);
                    clone.vehicules.add(nv.vehicules.get(0));
                    return clone;
                };

        // Remove vehicle
        BiFunction<Licence, Licence, Licence> removeVehicule =
                (ov, nv) -> {
                    Licence clone = new Licence(ov);
                    Vehicule v = nv.vehicules.get(0);
                    clone.vehicules.removeIf(x -> x.make.equalsIgnoreCase(v.make)
                            && x.model.equalsIgnoreCase(v.model)
                            && x.year == v.year);
                    return clone;
                };

        // -------------------- Main Loop --------------------
        int operation;

        while ((operation = selectedOperation.get()) != 7) {

            String id = licenceId.get();

            switch (operation) {
                case 0 -> System.out.println(
                        licences.merge(id, new Licence(expDate.get(), null), addDriver)
                );

                // Remove Driver
                case 1 -> System.out.println(
                        licences.computeIfPresent(id, removeDriver)
                );

                // Change Insurance
                case 2 -> System.out.println(
                        licences.merge(id, new Licence(null, insurance.get()), changeInsurance)
                );

                // Suspend Licence
                case 3 -> System.out.println(
                        licences.computeIfPresent(id, suspendLicence)
                );

                // Renew License
                case 4 -> System.out.println(
                        licences.merge(id, new Licence(expDate.get(), null), renewLicence)
                );
                      // // Add Vehicle
                case 5 -> System.out.println(
                        licences.merge(id, new Licence(null, null, vehiculeSupplier.get()), addVehicule)
                );

                // // Remove Vehicle
                case 6 -> System.out.println(
                        licences.merge(id, new Licence(null, null, vehiculeSupplier.get()), removeVehicule)
                );

                default -> System.out.println("Invalid choice.");
            }
        }

        System.out.println("Goodbye!");
    }
}
