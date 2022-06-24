import java.util.*;
class Conditional_char
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);

		System.out.print("\n\t\t\tEnter any character :");
		char ch= sc.next().charAt(0);
		
		if(ch>='a' && ch<='z') 
		
			System.out.print("\n\t\t\tIt is a Lowercase Alphabet");
		
		else
 		
			System.out.print("\n\t\t\tIt is not a Lowercase Alphabet");
		
		
	         if(ch>=0 &&  ch<=9 )
 		
			System.out.print("\n\t\t\tIt is Digit");
		

		else
 		
			System.out.print("\n\t\t\tIt is a special symbol");
		

		
		
	}
}