package animals.birds.flying;

import animals.birds.Bird;

import java.util.Objects;

public class FlyingBird extends Bird {

    private String moveType;

    public FlyingBird(String name, int age, String habitat, String moveType) {
        super(name, age, habitat);
        setMoveType(moveType);
    }

    public void fly() {
        System.out.println("I`m flying!");
    }

    @Override
    public void eat() {
        System.out.println("i`m eating!");
    }

    @Override
    public void go() {
        System.out.println("i`m going!");
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String mt) {
        this.moveType = ((mt == null) || (mt.isBlank()) || (mt.isEmpty()))
                ? NO_INFO
                : mt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlyingBird fb = (FlyingBird) o;

        return Objects.equals(getMoveType(), fb.getMoveType())
                && Objects.equals(getName(), fb.getName())
                && Objects.equals(getAge(), fb.getAge())
                && Objects.equals(getHabitat(), fb.getHabitat());
    }

    @Override
    public String toString() {
        return "Flying bird: " +
                getName() +
                ", age - " + getAge() +
                ", habitat - " + getHabitat() +
                ", move type - " + getMoveType();
    }
}
