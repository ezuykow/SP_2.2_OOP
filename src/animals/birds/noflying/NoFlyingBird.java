package animals.birds.noflying;

import animals.birds.Bird;
import animals.birds.flying.FlyingBird;

import java.util.Objects;

public class NoFlyingBird extends Bird {

    private String moveType;

    public NoFlyingBird(String name, int age, String habitat, String moveType) {
        super(name, age, habitat);
        setMoveType(moveType);
    }

    public void walk() {
        System.out.println("I`m walking!");
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

        NoFlyingBird fb = (NoFlyingBird) o;

        return Objects.equals(getMoveType(), fb.getMoveType())
                && Objects.equals(getName(), fb.getName())
                && Objects.equals(getAge(), fb.getAge())
                && Objects.equals(getHabitat(), fb.getHabitat());
    }

    @Override
    public String toString() {
        return "No flying bird: " +
                getName() +
                ", age - " + getAge() +
                ", habitat - " + getHabitat() +
                ", move type - " + getMoveType();
    }
}
