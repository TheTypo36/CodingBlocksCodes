package starter;
import java.util.*;
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int bin=0,n=0,rem=0,count=0;
		double dec=0;
		System.out.println("Enter the Binary number");
 		bin=sc.nextInt();
		n=bin;
		while(n!=0) {
			count++;
			n=n/10;
		}
		for(double i=0.0;i<=count;i++)
		{
			rem=bin%10;
			if(rem==1)
			{
				dec=dec+(Math.pow(2.0,i));
			}
			bin=bin/10;
			
		}
		System.out.println("The decimal number: "+(int)dec);
	}

}
