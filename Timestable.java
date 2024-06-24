import java.util.Scanner;

public class Timestable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("introduce un numero: ");
        int num = input.nextInt();
        times(num);
        input.close();
    }

    static void times(int num) {
        for (int i = 0; i < 1; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(num + " * " + j + " = " + (j * num));
            }
            System.out.println();
        }
    }
}
