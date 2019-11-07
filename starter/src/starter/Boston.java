package starter;

import java.util.Scanner;

public class Boston {
		public static int prime(int n) {
			int sum=0;
				while(n%2==0)
				{
					sum=sum+2;
					n=n/2;
				}
				for(int i=3;i<=Math.sqrt(n);i+=2)
				{
					while(n%i==0) {
						sum=sum+i;
						n=n/i;
					}
				
			
				}
				if(n>2) {
					sum=sum+n;
				}
				return sum;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int n=sc.nextInt(),sum=0,sum1=0;
			int num=n,r=0;
			while(num!=0) {
				r=num%10;
				sum=sum+r;
				num=num/10;
			}
		 sum1=prime(n);
		 System.out.println(sum+"\t"+sum1);
			if(sum==sum1)
				System.out.println("1");
			else
				System.out.println("0");
	}

}
