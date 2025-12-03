package org.example.functionalprogrammingjava8.petproject;

import java.util.ArrayList;
import java.util.List;

public class PlayfullPets {

    public static void matchPet(String criteria, PetMatcher matcher, Pet pet) {
        System.out.println("\n" + criteria + ":");
        System.out.println("First: " + matcher.first(pet));
        System.out.println("All matches: ");
        List<Pet> matches = matcher.match(pet);
        for (Pet p : matches) {
            System.out.println(p);
        }
    }


    public static void main(String[] args) {
        Pet.pets.add(new Pet("Sruffy", "dog", "poodle", "white", 895.00));
        Pet.pets.add(new Pet("Meow", "cat", "siamese", "white", 740.50));
        Pet.pets.add(new Pet("Max", "dog", "poodle", "black", 540.50));
        Pet.pets.add(new Pet("Cuddles", "dog", "pug", "black", 1282.75));
        Pet.pets.add(new Pet("Slider", "snake", "garden", "green", 320.00));

        PetMatcher breedMatcher = new PetMatcher() {
            @Override
            public List<Pet> match(final Pet pet) {
                List<Pet> matches = new ArrayList<>();

                for (Pet p : Pet.pets) {
                    if (p.equals(pet)) {
                        matches.add(p);
                    }
                }

                return matches;
            }

        };


        PetMatcher priceMatcher = new PetMatcher() {
            @Override
            public List<Pet> match(final Pet pet) {

                List<Pet> matches = new ArrayList<>();
                for (Pet p : Pet.pets) {

                    if (p.price <= pet.price) {
                        matches.add(p);
                    }
                }
                return matches;
            }

            @Override
            public Pet first(final Pet pet) {

                int index = -1;

                for (Pet p : Pet.pets) {
                    if (p.price <= pet.price) {
                        return p;
                    }
                }
                return null;
            }
        };

        matchPet("Poodles", breedMatcher, new Pet(null, "dog", "poodle", null, 0.0));
        matchPet("Pets for $800 or less", priceMatcher, new Pet(null, null, null, null, 800.0));
    }
}
