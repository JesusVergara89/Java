public class Convertionstypes {
    public static void main(String[] args) {

        int a = 3, b = 2;

        char num = '4';

        int n = (int) Math.pow(a, b);

        int n1 = Character.getNumericValue(num);

        int n2 = (int) Math.pow(a, b);

        // int n1 = Math.pow(a, b); this is an error because we cannot onvert a double
        // varible, that is what math.pow() return into a double.

        // With casting (int) we can help to int to save the double value that return
        // pow into a int

        System.out.println(n);
        System.out.println(n1);
        System.out.println(n2);

    }
}
