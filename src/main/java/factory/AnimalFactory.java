package factory;

import model.Pet;
import model.impl.Cat;
import model.impl.Dog;

import java.util.HashMap;
import java.util.Map;

public class AnimalFactory {
    private static final Map<String, Pet> pets = new HashMap<>();

    public Pet getAnimalByWoolenBuddy(String woolenBuddy) {
        Pet pet = pets.get(woolenBuddy);

        if (pet == null) {
            switch (woolenBuddy) {
                case "cat" -> {
                    System.out.println("New Cat object has been created");
                    pet = new Cat();
                }
                case "dog" -> {
                    System.out.println("New Dog object has been created");
                    pet = new Dog();
                }
            }
            pets.put(woolenBuddy, pet);
        }
        return pet;
    }

}
