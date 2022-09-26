public class Flower {
    private String color;
    private String country;
    private double cost;
    private int lifeSpan;

    public Flower(String color, String country, double cost, int lifeSpan) {
        setColor(color);
        setCountry(country);
        setCost(cost);
        setLifeSpan(lifeSpan);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = ((color == null) || (color.isEmpty()) || (color.isBlank()))
                ? "white"
                : color;

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = ((country == null) || (country.isEmpty()) || (country.isBlank()))
                ? "Russia"
                : country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = Math.max(cost, 1);
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = (lifeSpan >= 0)
                ? lifeSpan
                : 3;
    }
}
