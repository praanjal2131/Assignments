import java.util.*;
class Subjects_Marks
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("\n\t\t\tEnter the marks of five subjects:");
		float physics= sc.nextFloat();
		float chemistry= sc.nextFloat();
		float biology= sc.nextFloat();
		float maths= sc.nextFloat();
		float computer= sc.nextFloat();

		float percentage =(physics+chemistry+biology+maths+computer)/5;
		System.out.println("\n\t\t\tpercentage is:"+percentage);

		if (percentage>=90)
		{
			System.out.println("\n\t\t\tGrade is A");
		}
		else if (percentage>=80)
		{
			System.out.println("\n\t\t\tGrade is B");
		}

		else if (percentage>=70)
		{
			System.out.println("\n\t\t\tGrade is C");
		}

		else if (percentage>=60)
		{
			System.out.println("\n\t\t\tGrade is D");
		}

		else if (percentage>=40)
		{
			System.out.println("\n\t\t\tGrade is E");
		}

		else 
		{
			System.out.println("\n\t\t\tGrade is F");
		}

	}
}