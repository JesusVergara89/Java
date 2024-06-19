public class Switch {
    public static void main(String[] args) {
        int x = 3;

        int y = 4;

        switch (x)  {
            case 1:
            System.out.println("El valor no es 1");break;
            case 3:
            System.out.println("El valor es 3");break;        
            default:
            System.out.println("el valor no es ningun");
        }

        switch (y)  {
            case 1:
            case 2:
            case 3:
            System.out.println("El de y esta entre 1 y 3");break;
            case 4:
            case 5:
            case 6:
            System.out.println("El valor de y esta entre 4 y 5");break;        
            default:
            System.out.println("el valor no es ningun");
        }
    }
}
