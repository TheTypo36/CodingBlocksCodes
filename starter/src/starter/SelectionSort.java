package starter;
import java.util.*;
public class SelectionSort {

		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
		   int n=sc.nextInt(),swap=0,index=0,minindx=0;
		   int[] arr=new int[n];
		   for(int i=0;i<n;i++)
		   {
			   arr[i]=sc.nextInt();
		   }
			for(int i=0;i<n-1;i++)
			{
			minindx=i;
			for(int j=i;j<n;j++){
				if(arr[j]<arr[minindx])
				{
					minindx=j;
					index=j;
				}
				swap=arr[i];
				arr[i]=arr[minindx];
				arr[minindx]=swap;
			}
			
		
			

		   }
	    
		for(int k=0;k<n;k++)
		   {
			   System.out.println(arr[k]);
		   }
	}
}
