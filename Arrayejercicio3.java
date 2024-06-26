public class Arrayejercicio3 {
    public static void main(String[] args) {

        String[] names = { "jesus", "renata", "romina", "rogelio", "edilma", "esteban" };

        String data = all_string(names, "E");

        System.out.println(data);

    }

    static String all_string(String[] data, String letter) {
        String aux = "";
        String aux2 = letter.toLowerCase();
        for (int i = 0; i < data.length; i++) {
            if (data[i].startsWith(aux2)) {
                aux += data[i] + " ";
            }
        }
        return aux;
    }
}
