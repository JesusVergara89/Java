import java.util.Scanner;

public class Oddnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = input.nextInt();
        boolean answer = oddNumber(number);
        System.out.println(answer);
        input.close();
    }


    static boolean oddNumber(double num){
        if ( (num % 2) == 0 ){
            return  true;
        }else{
            return false;
        }
    }
}
