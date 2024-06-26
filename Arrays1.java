import java.util.Random;

public class Arrays1 {
    public static void main(String[] args) {
       mostrar_array(crear_array(10, 20)); 
    }

    static void mostrar_array(int[] n){
        for (int i = 0; i < n.length-1; i++){
            System.out.print("[" + n[i] + "] ");
        }
        System.out.println();
    }

    static int[] crear_array(int elementos,int max_elementos){
          int[] array = new int[elementos];
          Random r = new Random();
          for (int i = 0; i < array.length-1; i++){
            array[i] = r.nextInt(max_elementos);
        }
        return array;
    }
}
