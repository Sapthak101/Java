import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean retry = true;
        
        while (retry) 
        {

            try 
            {
                System.out.print("Enter the first number: ");
                int num1 = input.nextInt();

                System.out.print("Enter the second number: ");
                int num2 = input.nextInt();

                int result = num1 / num2;
                System.out.println("The result is: " + result);

                retry = false;

            }

            catch (ArithmeticException e) 
            {
                System.out.println("Cannot divide by zero. Please try again.");
            }

            finally 
            {
                System.out.print("Do you want to try again? (Yes/No): ");
                String option = input.next();

                if (option.equalsIgnoreCase("No")) {
                    retry = false;
                }
            }
        }
    }
}