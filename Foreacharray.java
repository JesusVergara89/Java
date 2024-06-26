public class Foreacharray {
    public static void main(String[] args) {
        int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

        for (int i : n) {
            System.out.print("[ " + i + " ]");
        }

        //System.out.println(Arrays.toString(n)); no me funciona
    }
}
