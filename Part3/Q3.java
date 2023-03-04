import java.util.Scanner;
public class Q3{

    public static void main(String args[]) {
        Scanner scan= new Scanner(System.in);

        int a[][] = new int[3][3];

        int sum1=0,sum2=0;
        System.out.println("Enter the elements for 1st matrix: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=scan.nextInt();
                if ((i+j)%2==0)
                {
                    sum2=sum2+a[i][j];
                }
                if (i==j)
                    sum1=sum1+a[i][j];
            }
        }

        System.out.println("The sum of the diagonals elements: "+sum1);
        System.out.println("The sum of the diagonals elements: "+((sum2-sum1)+a[(3/2)][3/2]));
    }
}