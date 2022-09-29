package animals.birds;

import animals.Animal;

public abstract class Bird extends Animal {

    private String habitat;

    public void hunt() {
        System.out.println("I`m hunting");
    }

    public Bird(String name, int age, String habitat) {
        super(name, age);
        setHabitat(habitat);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String h) {
        this.habitat = ((h == null) || (h.isEmpty()) || (h.isBlank()))
                ? NO_INFO
                : h;
    }
}
