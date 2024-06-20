import java.util.Scanner;

public class Exceicise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num> 0){
            if ((num / 10) < 0){
                System.out.println("One cifra");
            }else if (((num / 10) > 0) && ((num / 10) < 100 ) ){
                System.out.println("Thre cifra");
            }else if (((num / 10) >= 100) && ((num / 10) < 1000 ) ){
                System.out.println("Four cifra");
            }else{
                System.out.println("now cifra");
            }
        }
        input.close();
    }
}
