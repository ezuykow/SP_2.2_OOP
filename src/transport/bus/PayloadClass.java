package transport.bus;

public enum PayloadClass {
    EXTRA_LOW("Up to 10 people"),
    LOW("Up to 25 people"),
    MIDDLE("From 40 up to 50 people"),
    BIG("From 60 up to 80 people"),
    EXTRA_BIG("From 100 up to 120 people");

    public static void definePayload(Bus b) {
        PayloadClass pc = b.getPayload();

        for (PayloadClass value : PayloadClass.values()) {
            if (value.equals(pc)) {
                System.out.println(pc.getPayload());
                return;
            }
        }

        System.out.println("<no information!>");
    }

    private final String payload;

    PayloadClass(String p) {
        payload = p;
    }

    public String getPayload() {
        return payload;
    }
}
