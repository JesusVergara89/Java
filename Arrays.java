public class Arrays {
    public static void main(String[] args) {
        int[] notas = new int[5];

        for (int i = 0; i < notas.length-1; i++){
            notas[i] = i*3;
        }
        for (int i = 0; i < notas.length-1; i++){
            System.out.println(notas[i]);
        }
        
    }
}
