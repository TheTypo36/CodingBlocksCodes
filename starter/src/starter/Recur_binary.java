package starter;

public class Recur_binary {
	public static void main(String args[]) {
		int[] arr= {2,10,39,59,78};
		int x=59, l=arr.length;
		Recur_binary ob=new Recur_binary();
		int result=recur_bin(arr,0,l-1,x);
		if(result==-1)
			System.out.println("The number is not present in the list");
		else
			System.out.println("the number is present in the list at index of: "+result);
	}
	static int recur_bin(int arr[],int l,int u,int x) {
		int mid=0;
		if(u>=l) {
			mid=l+(u-1)/2;
			if(arr[mid]==x) 
				return mid;
			
			if(arr[mid]>x)
			
			return recur_bin(arr,l,mid-1,x);
		
			
				return recur_bin(arr,mid+1,u,x);
		}

	
		  
		return -1;
		
	}
		
}