public class Recursividad {

    static int factorial(int a) {
        int r;
        if (a == 0) {
            return 1;
        } else {
            r = a * factorial(a - 1);
        }
        return r;
    }

    public static void main(String[] args) {
        int f = factorial(4);
        System.out.println(f);
    }
}
