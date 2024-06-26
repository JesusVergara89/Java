public class Recursividadexcer1 {
    static int cantidad(int n) {
        int cifras = 1;
        if (n > 9) {
            int num = n /= 10;
            cifras += cantidad(num);
        }
        return cifras;
    }

    public static void main(String[] args) {
        int num = cantidad(10005);
        System.out.println(num);
    }
}
