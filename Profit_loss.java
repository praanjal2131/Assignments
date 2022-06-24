import java.util.*;
class Profit_loss
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("\n\t\t\t====Profit_Loss======");
		System.out.print("\n\t\t\tEnter selling price :");
		float selling_price= sc.nextFloat();

		System.out.print("\n\t\t\tEnter cost price :");
		float cost_price= sc.nextFloat();

		if (selling_price>1000)
		{
			double discount=0.2;
			double profit=(selling_price-cost_price)*0.2;
			System.out.print("\n\t\t\tMade profit :" + profit);

		}

		else
		{
			float loss =cost_price-selling_price;
			
			System.out.print("\n\t\t\tloss incurred :" + loss);
		}

	}
}