import java.util.Scanner;

public class Excer8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        String letter = "";
        for ( int i = 0; i < 5; i++){
            System.out.println("Digit word number:" + (i+1));
            String len = input.next();
            if ( max == 0){
                max = len.length();
                letter = len;
            }else{
                if ( len.length() > max){
                    max = len.length();
                    letter = len;
                }
            }
        }
        System.out.println(letter);
        System.out.println(max);
        input.close();
    }
}
