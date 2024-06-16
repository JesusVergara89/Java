public class Variables {
    public static void main(String[] args) {

        String chain_string = "jesus";
        char last_char = chain_string.charAt(chain_string.length()-1);

        System.out.println("["+chain_string+"]"+" has "+ chain_string.length() + " characters");
        System.out.println("the second letters is: " + chain_string.charAt(1));
        System.out.println("the last letters is: " +last_char);
    }
}
