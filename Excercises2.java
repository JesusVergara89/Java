public class Excercises2 {
    public static void main(String[] args) {
        int[] numbers = { 3, 5, 10, 7, 2, 8 };
        int grater = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > grater) {
                grater = number;
            }
        }

        System.out.println("El número mayor es: " + grater);
    }
}
