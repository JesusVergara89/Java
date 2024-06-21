import java.util.Scanner;

public class Excercises7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        String aux = "";

         for (int i = 0; i < word.length(); i++){
            aux += word.charAt(i) + " "; 
         }

        System.out.println(aux);

        input.close();
    }
}
