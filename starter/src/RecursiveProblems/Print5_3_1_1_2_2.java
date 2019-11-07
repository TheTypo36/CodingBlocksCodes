package RecursiveProblems;

import java.util.Scanner;

public class Print5_3_1_1_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			Pdskip(n);
	}
	public static void Pdskip(int n) {
		if(n==0)
			return;
		if(n%2==1)
		System.out.println(n);
		Pdskip(n-1);
		if(n%2==0)
		System.out.println(n);
	}

}
