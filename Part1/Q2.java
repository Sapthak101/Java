import java.util.Scanner;

public class Q2 {
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);

        int num1, num2;

        System.out.println("Enter two integers: ");
        num1=inp.nextInt();
        num2=inp.nextInt();

        System.out.println("The answer after AND operation: "+(num1 & num2));
        System.out.println("The answer after OR operation: "+(num1 | num2));
        System.out.println("The answer after XOR operation: "+(num1^num2));
    }
}