package starter;
import java.util.*;
public class Multiple {
	public static void mul(int n, int m, int z) {
		int count=0;
		for(int i=1;i<=z;i++) {
			if(i%m==0&&i%n==0)
				count++;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Multiple obj=new Multiple();
		System.out.println("entera");
		float t=sc.nextInt();
		int z=0,m=0,n=0;
		while(t!=0) {
			n=sc.nextInt();
			m=sc.nextInt();
			z=sc.nextInt();
			obj.mul(n, m, z);
			t--;
		}
	}

}
