package starter;
import java.util.*;
public class Inverse{
	static int inverse(int n) {
			int r=0;
		int s=n,num=n;
		double newnum=0;
		int counter=0;
		while(s!=0) {
			counter++;
			s=s/10;
		}
		for(int i=1;i<=counter;i++) {
		r=num%10;
		double e=Math.pow(10.0,(r-1));
		newnum=newnum+(i*e);
		num=num/10;
		}
		return (int)newnum;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the number");
		int n=sc.nextInt();
		
		System.out.println(inverse(n));
		
		
	}

}
