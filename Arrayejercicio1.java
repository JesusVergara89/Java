public class Arrayejercicio1 {
    public static void main(String[] args) {

        int[] array_data = { 2, 4, 5, 20, 6, 6, 6, 34, 2, 4, 6, 4 };
        int numero = 6;
        int aux = cantidad(array_data, numero);

        System.out.println(aux);
    }

    static int cantidad(int[] n, int m) {
        int counter = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == m) {
                counter++;
            }
        }
        return counter;
    }
}
