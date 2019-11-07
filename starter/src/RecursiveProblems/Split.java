package RecursiveProblems;

import java.util.Scanner;

public class Split {
       public static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		split(arr, 0, 0, "", 0, "");
		System.out.println(count);
	}
	public static void split(int arr[],int i,int sum1,String s1,int sum2,String s2) {
		if(i==arr.length) {
			if(sum1==sum2) {
				System.out.println(s1+" and "+s2);
				count++;
			}
			return;
		}
		split(arr,i+1,sum1+arr[i], s1+arr[i]+" ",sum2,s2);
		split(arr,i+1,sum1, s1,sum2+arr[i],s2+arr[i]+" ");
	}
}
