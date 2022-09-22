public class Human {
    String name;
    String city;
    String jobTitle;
    int yearOfBirth;

    public Human(String name, String city, String jobTitle, int yearOfBirth) {
        this.name = name;
        this.city = city;
        this.jobTitle = jobTitle;
        this.yearOfBirth = yearOfBirth;
    }

    void sayHello() {
        System.out.printf("Hello! My name is %s. I`m from %s. I`m was born in %d." +
                " I`m working as %s. Let`s get acquainted!\n",
                name, city, yearOfBirth, jobTitle);
    }
}
