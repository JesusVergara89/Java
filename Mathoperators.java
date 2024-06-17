public class Mathoperators {
    public static void main(String[] args) {

        int m =5, n = 5;
        double radio = (int)(Math.random()*10);
        double result = Math.pow(m, n);
        double square_result = Math.sqrt(result);
        double area = Math.PI*radio*radio;
        System.out.println(result);
        System.out.println(square_result);
        System.out.println(area);
        System.out.println(radio);

    }
}
