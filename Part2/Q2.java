import java.util.Scanner;

public class Q2
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String fname=inp.nextLine();
        System.out.println("Enter your last name: ");
        String lname=inp.nextLine();

        System.out.println("Your name is: "+lname+" "+fname);
    }
}