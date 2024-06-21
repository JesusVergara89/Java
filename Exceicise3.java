import java.util.Scanner;

public class Exceicise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num = input.nextInt();
        int cifras = 1;
        while (num > 9) {
            num /= 10;
            cifras++;            
        }

        System.err.println(cifras);
        input.close();
    }
}
