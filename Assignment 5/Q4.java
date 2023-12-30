import java.util.Scanner;
public class Q4 {
    public static void main(String args[])
    {
        int day;

        Scanner inp=new Scanner(System.in);

        System.out.println("Enter the day number: ");
        day=inp.nextInt();

        switch(day)
        {
            case 6, 13, 20, 27:
            {
                System.out.println("Today is Sunday");
                break;
            }
            case 7, 14, 21, 28:
            {
                System.out.println("Today is Monday");
                break; 
            }
            case 1, 8, 15, 22:
            {
                System.out.println("Today is Tuesday");
                break;
            }
            case 2, 9, 16, 23:
            {
                System.out.println("Today is Wednesday");
                break;
            }
            case 3, 10 ,17, 24:
            {
                System.out.println("Today is Thuesday");
                break;
            }
            case 4, 11, 18, 25:
            {
                System.out.println("Today is Friday");
                break;
            }
            case 5, 12, 19, 26:
            {
                System.out.println("Today is Saturday");
                break;
            }
            default:
                System.out.println("The day number is invalid");
        }
    }
}