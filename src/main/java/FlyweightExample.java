import factory.AnimalFactory;
import model.Pet;

import java.util.Arrays;
import java.util.List;

public class FlyweightExample {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        List<Pet> pets = Arrays.asList(
                animalFactory.getAnimalByWoolenBuddy("cat"),
                animalFactory.getAnimalByWoolenBuddy("dog"),
                animalFactory.getAnimalByWoolenBuddy("cat"),
                animalFactory.getAnimalByWoolenBuddy("dog")
        );

        pets.forEach(System.out::println);


    }
}
