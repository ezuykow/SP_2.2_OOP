package animals.mammals;

import animals.Animal;

public abstract class Mammal extends Animal {

    private String habitat;
    private int moveSpeed;

    public Mammal(String name, int age, String habitat, int moveSpeed) {
        super(name, age);
        setHabitat(habitat);
        setMoveSpeed(moveSpeed);
    }

    public void walk() {
        System.out.println("I`m walking");
    }

    @Override
    public void go() {
        System.out.println("I`m going");
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String h) {
        this.habitat = ((h == null) || (h.isEmpty()) || (h.isBlank()))
                ? NO_INFO
                : h;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = Math.max(moveSpeed, 1);
    }
}
