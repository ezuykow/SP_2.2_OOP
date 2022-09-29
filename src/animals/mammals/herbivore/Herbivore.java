package animals.mammals.herbivore;

import animals.mammals.Mammal;

public class Herbivore extends Mammal {

    private String foodType;

    public Herbivore(String name, int age, String habitat, int moveSpeed, String foodType) {
        super(name, age, habitat, moveSpeed);
        setFoodType(foodType);
    }

    public void graze() {
        System.out.println("I`m grazing!");
    }

    @Override
    public void eat() {
        System.out.println("I`m eating " + getFoodType());
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String ft) {
        this.foodType = ((ft == null) || (ft.isEmpty()) || (ft.isBlank()))
                ? NO_INFO
                : ft;
    }

    @Override
    public String toString() {
        return "Herbivore: " +
                getName() +
                ", age - " + getAge() +
                ", habitat - " + getHabitat() +
                ", move speed - " + getMoveSpeed() +
                ", food type - " + getFoodType();
    }
}
