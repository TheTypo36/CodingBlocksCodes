package starter;

import java.util.Scanner;

public class Allindices {

	 public static void main(String args[]) {
	       Scanner sc= new Scanner(System.in);
		   int n=sc.nextInt();
		   int arr[]=new int[n];
		   for(int i=0;i<n;i++){
			   arr[i]=sc.nextInt();
		   }
		   int m=sc.nextInt();
		int[] result=allIndices(arr,0,m,0);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
		   

	    }
	 public static int[] allIndices(int[] arr, int si, int data, int count) {
			if (si == arr.length) {
				int[] br = new int[count];
				return br;
			}
			int[] indices = null;
			if (arr[si] == data) {
				indices = allIndices(arr, si + 1, data, count + 1);
			} else {
				indices = allIndices(arr, si + 1, data, count);
			}

			// stack is falling
			if (arr[si] == data) {
				indices[count] = si;
			}

			return indices;
		}
}