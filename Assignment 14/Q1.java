public class Q1 {

    public static void main(String[] args) {
        String str = "Sapthak";
        String reverse = "";
        for (int i=str.length() - 1; i>=0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equalsIgnoreCase(reverse)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}