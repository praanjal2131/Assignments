import java.util.*;
class Triangle3Check
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.print("\n\t\t\tEnter three sides of triangle...\n");
	
		System.out.print("\n\t\t\t================================\n");
		System.out.print("\n\t\t\tSide1 =");
		int side1 =sc.nextInt();
	
		System.out.print("\n\t\t\tSide2 =");
		int side2 =sc.nextInt();
	
		System.out.print("\n\t\t\tSide3 =");
		int side3 =sc.nextInt();

		if(side1==side2  || side1==side3 ||side2==side3)
		{
			System.out.print("\n\t\t\t================================");
			System.out.print("\n\t\t\tTriangle is Isosceles \n");
		}

		else if(side1==side2 && side1==side3 && side2==side3)
		{
			System.out.print("\n\t\t\t================================");
			System.out.print("\n\t\t\tTriangle is Equilateral\n");
		}

		else
		{
			System.out.print("\n\t\t\t==================================");
			System.out.print("\n\t\t\tTriangle is Scalene/Right angle \n");
		}
	}
}