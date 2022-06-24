import java.util.*;
class Asciii
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);

		System.out.print("\n\t\t\tEnter any character :");
		char ch= sc.next().charAt(0);
		
		if(ch>=65 && ch<=90)
		{
			System.out.print("\n\t\t\tThe range of ASCII value from A -Z");
		}
		else if(ch>=97 && ch<=122 )
 		{
			System.out.print("\n\t\t\tThe range of ASCII value from a -z");
		}
		
		else if(ch>=58 &&  ch<=64 )
 		{
			System.out.print("\n\t\t\tThe range of ASCII value from 0 - 9");
		}

		else
 		{
			System.out.print("\n\t\t\tThe range of ASCII value is for special symbols");
		}

		
		
	}
}