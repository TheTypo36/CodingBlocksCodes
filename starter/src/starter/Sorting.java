package starter;
import java.util.*;
public class Sorting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter array element "+i);
			a[i]=sc.nextInt();
		}
		System.out.println("The original array is:");
		for(int j=0;j<n;j++) {
			System.out.print(a[j]);
		}
		
		
	}

}
