public class Arraybidimensionalejercicio2 {
    public static void main(String[] args) {
        mostrarArray(crearMatriz(11));
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
        int aux = n;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (j == aux-1) {
                    b[i][j] = "X";
                    aux -=1;
                } else{
                    b[i][j] = "-";
                }
            }
        }
        return b;
    }
}
