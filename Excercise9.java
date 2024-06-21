import java.util.Scanner;

public class Excercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine().trim();

        int aux = 1;

        int counter = 0;

        for (int i = 0; i < text.length(); i++){
            if ( text.charAt(i) == ' ' && text.charAt(i + 1) != ' ' ){
                counter ++;
                aux++;
            }
        }
        System.out.println("Text: " + text);
        System.out.println("Spaces: " + counter);
        System.out.println("Word number: " + aux);
        input.close();
    }
}
