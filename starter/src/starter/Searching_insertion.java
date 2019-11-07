package starter;

public class Searching_insertion {
	static int insert(int arr[],int n,int x) {
		int sqrt=(int)Math.round(Math.sqrt(x));
		int j=0,i;
		for(i=0;i<n;i=i+sqrt) {
			if(arr[i]==x) {
				return i;
			}
			else{
			j=i-4;
			while(j>x) {				
				if(arr[j]==x)
					return j;
				j++;
			}
		}
		
	}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,43,56,34,76,55,35,34,63};
		System.out.println("Hello world ");
		int l=arr.length;
		int x=63;
		Searching_insertion obj=new Searching_insertion();
		if(obj.insert(arr, l-1, x)==-1)
				System.out.println("The element is not present");
		else
			System.out.println("The element is present at index "+obj.insert(arr, l-1, x));
				

	}

}
