import java.util.Scanner;

public class Bucles2 {
    public static void main(String[] args) {
        Scanner keyword = new Scanner(System.in);
        int num = 0;
        int total = 0;
        do {
            System.out.println("Type a number disting of 0");
            num = keyword.nextInt();
            total += num;
        } while ( num != 0);
        System.out.println("The total sum is: "+total);
        keyword.close();
    }
}
