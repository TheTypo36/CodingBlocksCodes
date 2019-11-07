package starter;
import java.util.*;
public class fab {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int a=0,b=1,c=0;
		while(n!=1)
		{
		
		 c=a+b;
		 a=b;
		 b=c;
		 n--;
		}
		 System.out.print(a+" ");
		}
	}

