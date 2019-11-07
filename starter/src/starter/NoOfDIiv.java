package starter;
import java.util.*;
public class NoOfDIiv {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				System.out.println(i);
				count++;
		}
		System.out.println(count);
	}

}
