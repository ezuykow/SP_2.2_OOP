import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Human[] humans = getHumans();
        Arrays.stream(humans).forEach(Human::sayHello);

        Map<String, Flower> flowers = getFlowers();
        flowers.forEach((key, value) -> System.out.printf("%s, grown in %s, cost - %.2f, life span - %d days\n",
                key, value.getCountry(), value.getCost(), value.getLifeSpan()));

        //Bouquet
        Map<String, Integer> flowersToBouquet = new HashMap<>();
        flowersToBouquet.put("rose", 3);
        flowersToBouquet.put("chrysanthemum", 5);
        flowersToBouquet.put("gypsophila", 1);
        collectBouquet(flowers, flowersToBouquet);
    }

    private static Human[] getHumans() {
        Human[] humans = new Human[5];

        humans[0] = new Human("Maxim", "Minsk",
                "brand manager", LocalDate.now().getYear() - 35);
        humans[1] = new Human("Anya", "Moscow",
                "methodologist of education programs", LocalDate.now().getYear() - 29);
        humans[2] = new Human("Katya", "Kaliningrad",
                "product manager", LocalDate.now().getYear() - 28);
        humans[3] = new Human("Artyom", "Moscow",
                "director of business development", LocalDate.now().getYear() - 27);
        humans[4] = new Human("Vladimir", "Kazan",
                LocalDate.now().getYear() - 21);

        return humans;
    }

    private static Map<String, Flower> getFlowers() {
        Map<String, Flower> flowers = new HashMap<>();

        flowers.put("rose", new Flower("", "Holland", 35.59, -1));
        flowers.put("chrysanthemum", new Flower("", "", 15, 5));
        flowers.put("peony", new Flower("", "England", 69.90, 1));
        flowers.put("gypsophila", new Flower("", "Turkey", 19.50, 10));

        return flowers;
    }

    private static void collectBouquet(Map<String, Flower> f, Map<String, Integer> f2) {
        double totalCost = 0;
        int lifeSpan = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> e : f2.entrySet()) {
            Flower flower = f.get(e.getKey());
            totalCost += e.getValue() * (flower.getCost());
            lifeSpan = Math.min(lifeSpan, flower.getLifeSpan());
        }
        totalCost *= 1.1;

        System.out.printf("Cost of a bouquet: %.2f, and its life span: %d days",
                totalCost, lifeSpan);
    }
}
