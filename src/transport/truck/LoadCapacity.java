package transport.truck;

public enum LoadCapacity {
    N1("Up to 3.5 tons"),
    N2("From 3.5 to 12 tons"),
    N3("From 12 tons");

    public static void defineAutoType(Truck t){
        LoadCapacity lc = t.getLoadCapacity();

        for (LoadCapacity capacity : LoadCapacity.values()) {
            if (capacity.equals(lc)) {
                System.out.println(lc.getLoadCapacity());
                return;
            }
        }

        System.out.println("<no information!>");
    }

    private final String loadCapacity;

    LoadCapacity(String s) {
        loadCapacity = s;
    }

    public String getLoadCapacity() {
        return loadCapacity;
    }
}
