public class Metodos {
    public static void main(String[] args) {
        int num1 = 2, num2 = 2;

        int sum = suma(num1, num2);
        int sum1 = sumaCondition(num1, num2);

        System.out.println(sum);
        System.out.println(sum1);
        test();
    }

    static int suma(int a, int b) {
        return a + b;
    }

    static int sumaCondition(int a, int b) {

        if (a == b) {
            return a + b;
        } else {
            return 100;
        }

    }

    static void test(){
        System.out.println("test");
        return;
    }
}
