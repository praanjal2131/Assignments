import java.util.*;
class Electricity_Unit
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.print("\n\t\t\t========Electricity Bill ===========");

		System.out.print("\n\t\t\tEnter electricity unit charges/day :");
		double unit = sc.nextDouble();
		
		double billpay = sc.nextDouble();
		

		if(unit<=50)
		{
			billpay =unit*0.50;
			System.out.print("\n\t\t\tElectricity Billpay is:" +billpay);
		}

		else if(unit<=100)
		{
			billpay =unit*0.75;
			System.out.print("\n\t\t\tBillpay unit is:" +billpay);
		}

		else if(unit>100)
		{
			billpay =unit*1.20;
			System.out.print("\n\t\t\tBillpay unit is:" +billpay);
		}

		else if(unit>250)
		{
			double t= 0.2*250;
			double surcharge_unit =unit*1.50;
			double total_ele_bill=t+surcharge_unit;
			System.out.print("\n\t\t\tToatal Electricity Billpay unit is:" +total_ele_bill);
		}

		else
		{
			System.out.print("\n\t\t\tElectricity discharge");
		}

	}
}