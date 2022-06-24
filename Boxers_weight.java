import java.util.*;
class Boxers_weight
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.print("\n\t\t\tEnter the weight :");
		int weight =sc.nextInt();
		System.out.print("\n\t\t\t================================\n");
		
		if (weight<115)
		{
			System.out.println("\n\t\t\tIt is a Flyweight" + "Pounds\n");
		}
		else if(weight>115  && weight<121)
		{
			
			System.out.print("\n\t\t\tIt is Bantam wieight \n");
		}

		else if(weight>122  && weight<153)
		{
			
			System.out.print("\n\t\t\tIt is Featherweight\n");
		}

		else if(weight>154  && weight<189)
		{
			System.out.print("\n\t\t\tIt is Middleweight\n");
		}


		else
		{
			
			System.out.print("\n\t\t\tIt is Heavyweight \n");
		}
	}
}