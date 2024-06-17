public class Relationsope {
    public static void main(String[] args) {
        int value1 = 5;
        int value2 = 4;

        String name = "jesus";

        String name1 = "manuel";

        String name2 = "Jesus";

        boolean assignation1 = value1 == value2;

        boolean assignation2 = value1 > value2;

        boolean differents_name = name.equals(name1);

        boolean ignore_case_name = name.equalsIgnoreCase(name2);

        System.out.println(assignation1);
        System.out.println(assignation2);
        System.out.println(differents_name);
        System.out.println(ignore_case_name);
    }
}
