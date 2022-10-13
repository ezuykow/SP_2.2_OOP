import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {

    static Queue<String> q1 = new ArrayDeque<>(5);
    static Queue<String> q2 = new ArrayDeque<>(5);
    static Queue<String> q3 = new ArrayDeque<>(5);

    public static void main(String[] args) {

        fillQ();
        show();

        System.out.println();
        addToQ("Masha");
        show();

        System.out.println();
        removeOne();
        show();
    }

    private static void show() {
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
    }

    private static void removeOne() {
        Random r = new Random();

        boolean allEmpty = true;
        for (int i = 0; i < 5; i++) {
            if (!q1.isEmpty() || !q2.isEmpty() || !q3.isEmpty()) {
                allEmpty = false;
                break;
            }
        }
        if (allEmpty) return;

        String remove = null;
        while (remove == null) {
            switch (r.nextInt(3)) {
                case 0:
                    remove = q1.poll();
                    break;
                case 1:
                    remove = q2.poll();
                    break;
                case 2:
                    remove = q3.poll();
                    break;
            }
        }
    }

    private static void fillQ() {
        Random r = new Random();

        for (int i = 0; i < r.nextInt(5); i++) {
            q1.add("Ivan");
        }
        for (int i = 0; i < r.nextInt(5); i++) {
            q2.add("Ivan");
        }
        for (int i = 0; i < r.nextInt(5); i++) {
            q3.add("Ivan");
        }
    }

    private static void addToQ(String s) {
        Queue<String> target = q1;

        if (q2.size() < target.size()) {
            target = q2;
        }
        if (q3.size() < target.size()) {
            target = q3;
        }

        target.add(s);
    }
}
