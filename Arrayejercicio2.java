public class Arrayejercicio2 {
    public static void main(String[] args) {
            String[] names = {"jesus", "vergara", "hola", "yo"};
            String data = long_array(names);
            System.out.println(data);
    }

    static String long_array(String[] data) {
        int aux = 0;
        String aux2 = "";
        for (int i = 0; i < data.length; i++) {
            if (aux == 0) {
                aux = data[i].length();
                aux2 = data[i];
            } else {
                if (aux < data[i].length()) {
                    aux = data[i].length();
                    aux2 = data[i];
                }
            }
        }
        return aux2;
    }
}
