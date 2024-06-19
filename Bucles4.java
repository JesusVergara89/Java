import java.util.Scanner;

public class Bucles4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double media = 0;
        for (int i = 0; i < 5; i++) {
              System.out.println("Tell me a number: " + (i+1) + " de 5");
              int num = input.nextInt();
              media += num; 
        }
        System.out.println("Thx for digit the 5 nunbers  and the media is: " + (media/5));

        input.close();

    }
}
