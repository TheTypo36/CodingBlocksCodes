package starter;
import java.util.*;
public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int n=sc.nextInt(),sum=sc.nextInt();
		int l=n-1,s=0;
		int a[]=new int[n];
		for(int i=0;i<=l;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<=l;i++) {
			s=a[i];
			for(int j=0;j<=l;j++) {
				s=s+a[j];
				if(s==sum)
				{
					System.out.println("Yes");
					return;
				}
			}
			System.out.println("No");
		}
	}

}
