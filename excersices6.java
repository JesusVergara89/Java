import java.util.Scanner;

public class excersices6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int aux = 0;
        String aux1 = "";
        do {
            num = input.nextInt();

            if (num > 0) {
                aux += num;
                aux1 += num + "+";
            }

        } while (num != 0);
        System.out.println(aux);
        System.out.println(aux1 + "\b=" + aux);
        input.close();
    }
}
