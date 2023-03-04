import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Q3 {
    public static void main(String args[])
    {
        int marks;

        Scanner inp=new Scanner(System.in);

        System.out.println("Enter Your Marks: ");
        marks=inp.nextInt();

        if (marks>=90)
        {
            System.out.println("You have obtained O grade");
        }
        else if (marks<90 && marks>=80)
        {
            System.out.println("You have obtained E grade");
        }
        else if (marks<80 && marks>=70)
        {
            System.out.println("You have obtained A grade");
        }
        else if (marks<70 && marks>=60)
        {
            System.out.println("You have obtained B grade");
        }
        else if (marks<60 && marks>=50)
        {
            System.out.println("You have obtained C grade");
        }
        else if (marks<50 && marks>=40)
        {
            System.out.println("You have obtained D grade");
        }
        else {
            System.out.println("You have Falied");
        }
    }
}