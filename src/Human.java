import java.sql.Struct;

public class Human {
    String name;
    String city;
    String jobTitle;
    int yearOfBirth;

    private static String d = "<no info>"; //default value
    public Human() {
        this(d, d, d, 0);
    }

    public Human(String name) {
        this(name, d, d, 0);
    }

    public Human(String name, int yearOfBirth) {
        this(name, d, d, yearOfBirth);
    }

    public Human(String name, String city) {
        this(name, city, d, 0);
    }

    public Human(String name, String city, int yearOfBirth) {
        this(name, city, d, yearOfBirth);
    }

    public Human(String name, String city, String jobTitle) {
        this(name, city, jobTitle, 0);
    }

    public Human(String name, String city, String jobTitle, int yearOfBirth) {
        this.name = name;
        this.city = city;
        this.jobTitle = jobTitle;
        this.yearOfBirth = Math.max(yearOfBirth, 0);
    }

    void sayHello() {
        System.out.printf("Hello! My name is %s. I`m from %s. I`m was born in %d." +
                " I`m working as %s. Let`s get acquainted!\n",
                name, city, yearOfBirth, jobTitle);
    }
}
