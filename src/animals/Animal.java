package animals;

import java.time.LocalDate;

public abstract  class Animal {

    public static final String NO_INFO = "<no info>";

    private String name;
    private int birthYear;

    public abstract void eat();

    public abstract void go();

    public void sleep() {
        System.out.println("I`m sleeping!");
    }

    public Animal(String name, int age) {
        setName(name);
        setBirthYear(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = ((n == null) || (n.isEmpty()) || (n.isBlank()))
                ? NO_INFO
                : n;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    private void setBirthYear(int age) {
        this.birthYear = LocalDate.now().getYear() - Math.abs(age);
    }
}
