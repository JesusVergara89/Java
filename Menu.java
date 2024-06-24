import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Elige el numero de opciones, el numero no puede ser 0 o menor ");
        int options = input.nextInt();
        data_menu(options);
        input.close();
    }

    static void data_menu(int num) {
        for (int i = 1; i <= num; i++) {
            if (i != num) {
                System.out.println("Opcion " + i);
            } else {
                System.out.println("Opcion salir " + i);
            }
        }
        Scanner input = new Scanner(System.in);
        System.out.println("elige una opcion: ");
        int data = input.nextInt();
        do {
            if (data != num) {
                System.out.println("Opcion escogida " + data);
                break;
            } else {
                System.out.println("saliste del programa");
            }
        } while (data != num);
        input.close();
    }
}
