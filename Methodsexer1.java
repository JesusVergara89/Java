import java.util.Scanner;

public class Methodsexer1 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         String name = input.nextLine();

         String togreattings = greattings(name);

         System.out.println(togreattings);

         input.close();
    }


    static String greattings(String name){
         String body = "Greatting and welcome Mr/Miss ";

         return body + name;
    }
}
