package starter;
import java.util.*;
public class Binary_search {
	static int binary(int arr[],int n) {
		int lower=0,upper=arr.length-1,mid=0;
		if(arr[lower]==n)
			return lower;
		else if(arr[upper]==n)
			return upper;
		else {
		while (lower!=upper) {
			mid=(lower+upper)/2;
			
			
			if(arr[mid]==n)
			{
			return mid;
			}
			
			else if(arr[mid]>n) {
				upper=mid-1;
			}
				else {
					lower=mid+1;
				}
					
			
}
		}
		return -1;
		
}		




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		System.out.println(binary(arr, m));
	}

}
