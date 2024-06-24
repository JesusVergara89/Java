import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("introduce la altura");
        int altura = input.nextInt();
        System.out.println("introduce la base");
        int base = input.nextInt();
        for (int i = 0; i < altura; i++){
            for (int j = 0; j < base; j++){
                System.out.print("+ ");
            }
            System.out.println();
        }

        for (int i = 0; i < altura; i++){
            for (int j = 0; j < base; j++){

                if( i == 0 || i == altura - 1 || j == 0 || j == base - 1){
                    System.out.print("* ");
                }else{
                    System.err.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("la altura es : " + altura + " y la base es: " + base);
        input.close();
    }
}