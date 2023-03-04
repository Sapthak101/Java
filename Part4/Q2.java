import java.util.*;

class Dimen_2
{
    double length, breadth;

    double calculate2DSheetCost() 
    {
		Scanner inp=new Scanner(System.in);

        System.out.println("Enter the length and breadth: ");
        length=inp.nextDouble();
        breadth=inp.nextDouble();

        double cost=length*breadth*40;

        return cost;
	}
}

class Dimen_3 extends Dimen_2
{
    Double height;
    double calculate3DSheetCost() 
    {
		Scanner inp=new Scanner(System.in);

        System.out.println("Enter the length and breadth and Height: ");
        length=inp.nextDouble();
        breadth=inp.nextDouble();
        height=inp.nextDouble();

        double cost=(2*(length*breadth)+4*(breadth*height))*60;

        return cost;
	}
}

public class Q2{
	public static void main(String[] args) {
		Dimen_3 obj = new Dimen_3();
        System.out.println("The cost of the 2D sheet is: "+obj.calculate2DSheetCost());
        System.out.println("The cost of the 3D sheet is: "+obj.calculate3DSheetCost());
		
	}
}