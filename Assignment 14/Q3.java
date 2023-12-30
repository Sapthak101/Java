import java.util.*;
 
public class Q3
{
   public static void main(String args[])
   {
      Scanner in1 = new Scanner(System.in);
      Scanner in2 = new Scanner(System.in);

      System.out.print("Enter the first string: ");
      String str1 = in1.nextLine();
      System.out.print("Enter the second string: ");
      String str2 = in2.nextLine();

      if(str1.contains(str2))
         System.out.println("String 2 is present in String 1");
      else
         System.out.println("String 2 is not present in String 1");
   }
}