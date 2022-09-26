import java.sql.Struct;

public class Human {
    private String name;
    private String city;
    private String jobTitle;
    private int yearOfBirth;

    private final static String d = "<no info>"; //default value
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
        this.jobTitle = jobTitle;
        setCity(city);
        setYearOfBirth(yearOfBirth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if ((city != null) && (!city.isEmpty()) && (!city.isBlank())) {
            this.city = city;
        } else {
            this.city = d;
        }
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
            this.yearOfBirth = Math.max(yearOfBirth, 0);
    }

    void sayHello() {
        System.out.printf("Hello! My name is %s. I`m from %s. I`m was born in %d." +
                " I`m working as %s. Let`s get acquainted!\n",
                name, city, yearOfBirth, jobTitle);
    }
}
