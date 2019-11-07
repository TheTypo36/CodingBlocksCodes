package RecursiveProblems;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(factorial(n));
	}
	public static int factorial(int n) {
		int pro=1;
		if(n==0) {
			return 1;
		}
	
		return n*factorial(n-1);

	}

}
