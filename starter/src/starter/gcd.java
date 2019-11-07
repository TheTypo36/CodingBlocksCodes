package starter;
import java.util.Scanner;
public class gcd {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=0,n1=0,n2=0;
		System.out.println("Enter the number");
		n=sc.nextInt();
		n1=sc.nextInt();
		while(n%n1!=0)
		{
			n2=n%n1;
			n=n1;
			n1=n2;
					
		}
		System.out.println("The greatest common factor is: "+n1);
	}
}
