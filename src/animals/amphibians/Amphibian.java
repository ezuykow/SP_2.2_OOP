package animals.amphibians;

import animals.Animal;
import animals.mammals.predators.Predator;

import java.util.Objects;

public class Amphibian extends Animal {

    private String habitat;

    public Amphibian(String name, int age, String habitat) {
        super(name, age);
        this.habitat = habitat;
    }

    @Override
    public void eat() {
        System.out.println("I`m eating");
    }

    @Override
    public void go() {
        System.out.println("I`m going");
    }

    public void hunt() {
        System.out.println("I`m hunting");
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String h) {
        this.habitat = ((h == null) || (h.isEmpty()) || (h.isBlank()))
                ? NO_INFO
                : h;
    }

    @Override
    public String toString() {
        return "Amphibian: " +
                getName() +
                ", age - " + getAge() +
                ", habitat - " + getHabitat();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Amphibian predator = (Amphibian) o;

        return Objects.equals(getName(), predator.getName())
                && Objects.equals(getAge(), predator.getAge())
                && Objects.equals(getHabitat(), predator.getHabitat());
    }
}
