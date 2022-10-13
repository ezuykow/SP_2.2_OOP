package sponsor;

public class Sponsor {

    private String name;
    private int sum;

    public Sponsor(String name, int sum) {
        setName(name);
        setSum(sum);
    }

    public void planRace() {
        //??
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ((name == null) || (name.isBlank())) {
            throw new IllegalArgumentException("Illegal sponsor`s name");
        }
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = Math.max(sum, 0);
    }
}
