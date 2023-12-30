import java.util.Scanner;

public class Q1 {
    public static void main(String args[])
    {
        String name, section, branch;
        int rollno;

        Scanner inp= new Scanner(System.in);

        System.out.println("Enter your name: ");
        name=inp.nextLine();

        System.out.println("Enter your section: ");
        section=inp.nextLine();

        System.out.println("Enter your branch: ");
        branch=inp.nextLine();

        System.out.println("Enter your rollno: ");
        rollno=inp.nextInt();

        System.out.println("Your name is: "+name);
        System.out.println("Your section is: "+section);
        System.out.println("Your branch is: "+branch);
        System.out.println("Your rollno is: "+rollno);
    }
}