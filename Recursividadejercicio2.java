public class Recursividadejercicio2 {
    static int otro(int a, int b) {
        int result = 1;
        int aux;
        if (a > 0 && b > 0) {
            int num = b - 1;
            aux = otro(a, num);
            result *= aux * a;
        }
        return result;
    }

    public static void main(String[] args) {
        int resultado = otro(2, 5);
        System.out.println(resultado);
    }
}
