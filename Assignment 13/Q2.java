import java.util.*;

public class Q2 {

    private int x;

    public void processInput() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        x = scanner.nextInt();

        if (x < 0) {
            throw new NegativeNumberException("Negative number exception!");
        } else {
            System.out.println("Double value of the number is: " + (x * 2));
        }

        scanner.close();
    }

    public class NegativeNumberException extends Exception {
        public NegativeNumberException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Q2 processInput = new Q2();

        try {
            processInput.processInput();
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }

}