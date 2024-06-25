//This is about method overloaded
public class Sobrecargara {
    public static void main(String[] args) {
        saludar();
        saludar("jesus");
        saludar("jesus","germany");

        int sum_a_b = suma(2,2);
        System.out.println(sum_a_b);
        suma(4.0,4);
        suma(4,4,"jesus");
    }

    static void saludar(){
        System.out.println("hola como estas?");
    }
    static void saludar(String nombre){
        System.out.println("hola como estas " + nombre + " ?");
    }
    static void saludar(String nombre, String ciudad){
        System.out.println("hola como estas " + nombre + " que tal el clima en " + ciudad+ " ?");
    }

    static int suma(int a, int b){
        return (a+b);
    }

    static void suma(double a, int b){
        System.out.println(a+b);
    }

    static void suma(double a, double b, String name){
        System.out.println("Hola "+name+" la suma de los numero es: "+ (a+b));
    }

}
