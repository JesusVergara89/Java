import java.util.Scanner;

public class Dataentry {
    public static void main(String[] args) {
        String name;
        int n;
        Scanner intro_name = new Scanner(System.in);
        System.out.print("introduxaca b");
        name = intro_name.nextLine();
        intro_name.nextLine();
        System.out.println(name);
        System.out.print("introduxaca numero");
        n = intro_name.nextInt();
        System.out.println(n);
        intro_name.close();
    }
}
