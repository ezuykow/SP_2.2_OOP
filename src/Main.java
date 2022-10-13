import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<List<String>> matrix = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            matrix.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                matrix.get(i).add(j, "○");
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matrix.get(i).get(j));
            }
            System.out.println();
        }

        List<List<String>> matrix2 = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            matrix2.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                if (i % 2 == j % 2) {
                    matrix2.get(i).add(j, "○");
                } else {
                    matrix2.get(i).add(j, "●");
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matrix2.get(i).get(j));
            }
            System.out.println();
        }

    }
}