import java.util.Arrays;

public class Foreachjave2 {
    public static void main(String[] args) {
        int[][] n = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int[] fila : n) {
            for (int columna : fila) {
                System.out.print(columna + " ");
            }
            System.out.println();
        }

        for (int[] fila : n) {
            System.out.println(Arrays.toString(fila));
        }

        System.out.println(Arrays.deepToString(n));

    }
}
