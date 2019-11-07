package RecursiveProblems;
import java.util.*;
public class Print1to5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		pi(n);
	}
	public static void pi(int n) {
		if(n==0)
			return;
		pi(n-1);
		System.out.println(n);
	}

}
