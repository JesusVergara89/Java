import java.util.Scanner;

public class Bubles1 {
    public static void main(String[] args) {
        Scanner keyword = new Scanner(System.in);
        int num = 0;
        System.out.println("Type a number disting of 0");
        num = keyword.nextInt();
        while (num != 0) {
            System.out.println("Type a number disting of 0");
            num = keyword.nextInt();
        }
        keyword.close();
    }
}
