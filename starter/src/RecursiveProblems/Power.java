`package RecursiveProblems;
import java.util.*;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		System.out.println(power(x,n));
	}
	public static int power(int x,int n) {
		int product=0;
		if(n==0)
			return 1;
		product=x*power(x,n-1);
		return product;
	}

}
