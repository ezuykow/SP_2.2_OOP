package transport.car;

public enum BodyType {
    SEDAN("Sedan"),
    HATCHBACK("Hatchback"),
    COUPE("Coupe"),
    UNIVERSAL("Universal"),
    SUV("SUV"),
    CROSSOVER("Crossover"),
    PICKUP("Pickup"),
    VAN("VAN"),
    MINIVAN("MiniVAN");

    public static void defineBodyType(Car c) {
        BodyType bt = c.getBodyType();

        for (BodyType bType : BodyType.values()) {
            if (bType.equals(bt)) {
                System.out.println(bt.getBodyType());
                return;
            }
        }

        System.out.println("<no information!>");
    }

    private final String bodyType;

    BodyType(String s) {
        bodyType = s;
    }

    public String getBodyType() {
        return bodyType;
    }
}
