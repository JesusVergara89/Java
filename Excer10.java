import java.util.Scanner;

public class Excer10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine().trim();
        String aux1 = word;
        String aux2 = "";

        while (word.length() > 0) {
            aux2 += word.charAt(word.length() - 1);
            word = word.substring(0, word.length() - 1);
        }

        if (aux2.equals(aux1)) {
            System.out.println("palindro word " + aux2 + " is equal to " + aux1);
        } else {
            System.out.println("Not palindro word "+ aux2 + " is not equal to " + aux1);
        }

        input.close();
    }
}
