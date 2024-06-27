public class Arraybidimensionalejercicio1 {
    public static void main(String[] args) {
        mostrarArray(crearMatriz(5));
    }

    static void mostrarArray(String[][] b) {
        for (String[] fila : b) {
            for (String columna : fila) {
                System.out.print(columna + " ");
            }
            System.out.println();
        }
    }

    static String[][] crearMatriz(int n) {
        String[][] b = new String[n][n];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (i == j) {
                    b[i][j] = "X";
                } else {
                    b[i][j] = "-";
                }
            }
        }
        return b;
    }
}
