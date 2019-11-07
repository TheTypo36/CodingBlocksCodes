package starter;
import java.util.*;
public class Leapyr {
	static int check(int n)
	{
		int c=0,r=0,num=0;
		num=n;
		while(n!=0)
		{
			r=num%10;
			c++;
			num=num/10;
		}
		return c;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int yr=sc.nextInt();
		if(check(yr)!=4)
		{
			System.out.println("Please enter a four digit year");
			System.exit(0);
		}
		if(yr%4==0){
			System.out.println("The year is a leap year");
		}
		else 
			System.out.println("The year is not a leap year");
	}
}
