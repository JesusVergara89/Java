import java.util.Scanner;

public class Execices1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digit a number N: ");

        int num = input.nextInt();

        int grater = Integer.MIN_VALUE, counterMex = 0;
        int lower = Integer.MAX_VALUE, counterMin = 0;

        for (int i = 0; i < num; i++) {
            int datainput = input.nextInt();
            if (datainput > grater) {
                grater = datainput;
                counterMex = 1;
            } else if (datainput == grater) {
                counterMex++;
            }

            if (datainput < lower) {
                lower = datainput;
                counterMin = 1;
            } else if (datainput == lower) {
                counterMin++;
            }
        }
        System.out.println("the grater value is : " + grater + " and appear " + counterMex + " times");
        System.out.println("the lower value is : " + lower + " and appear " + counterMin + " times");
        input.close();

    }
}
