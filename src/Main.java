import animals.Animal;
import animals.amphibians.Amphibian;
import animals.birds.Bird;
import animals.birds.flying.FlyingBird;
import animals.birds.noflying.NoFlyingBird;
import animals.mammals.herbivore.Herbivore;
import animals.mammals.predators.Predator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals;

        animals = getFlyingBirds();
        animals.forEach(System.out::println);

        System.out.println("\n");
        animals = getNoFlyingBirds();
        animals.forEach(System.out::println);

        System.out.println("\n");
        animals = getAmphibians();
        animals.forEach(System.out::println);

        System.out.println("\n");
        animals = getHerbivore();
        animals.forEach(System.out::println);

        System.out.println("\n");
        animals = getPredators();
        animals.forEach(System.out::println);
    }

    private static List<Animal> getPredators() {
        Predator an;
        List<Animal> a = new ArrayList<>();

        an = new Predator("Tiger", 3, "jungle", 50, "meat");
        a.add(an);

        an = new Predator("Bear", 5, "forest", 80, "meat");
        a.add(an);

        an = new Predator("Hyena", 2, "desert", 70, "meat");
        a.add(an);

        an = null;
        return a;
    }

    private static List<Animal> getHerbivore() {
        Herbivore an;
        List<Animal> a = new ArrayList<>();

        an = new Herbivore("Horse", 5, "fields", 40, "grass");
        a.add(an);

        an = new Herbivore("Giraffe", 3, "desert", 20, "leafs");
        a.add(an);

        an = new Herbivore("Gazelle", 1, "fields", 60, "grass");
        a.add(an);

        an = null;
        return a;
    }

    private static List<Animal> getFlyingBirds() {
        Bird bird;
        List<Animal> a = new ArrayList<>();

        bird = new FlyingBird("Gull", 2, "beach", "fly");
        a.add(bird);

        bird = new FlyingBird("Albatros", 1, "sea", "fly");
        a.add(bird);

        bird = new FlyingBird("Falcon", 3, "field", "fly");
        a.add(bird);

        bird = null;
        return a;
    }

    private static List<Animal> getNoFlyingBirds() {
        Bird bird;
        List<Animal> a = new ArrayList<>();

        bird = new NoFlyingBird("Peacock", 1, "desert", "on foot");
        a.add(bird);

        bird = new NoFlyingBird("Penguin", 2, "glacier", "on foot");
        a.add(bird);

        bird = new NoFlyingBird("dodo", 0, "fields", "on foot");
        a.add(bird);

        bird = null;
        return a;
    }

    private static List<Animal> getAmphibians() {
        Amphibian amph;
        List<Animal> a = new ArrayList<>();

        amph = new Amphibian("Frog", 1, "river");
        a.add(amph);

        amph = new Amphibian("Freshwater snake", 1, "river");
        a.add(amph);

        amph = null;
        return a;
    }
}