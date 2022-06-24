import java.util.*;
class Leap_yr
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("\n\t\t\tEnter the year  : ");
int year=sc.nextInt();


if((year%4==0 && year%100!=0 ) || (year%400==0))
{
System.out.print("\n\t\t\tYear is Leap year ");
}
else
{
System.out.print("\n\t\t\tYear is not Leap year");
}

}
}