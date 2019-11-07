package starter;
public class Check_sorted {
	static int recur_array(int a[],int n) {
		if(n==1)
		return 1;
		else
			return (a[n-1]<a[n-2])?0:recur_array(a,(n-1));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {5,6,11,12,13};
		int l=ar.length;
		if(recur_array(ar,l)==1) 
			System.out.println("The array are sorted");
		
			else 
				System.out.println("The array are not sorted: ");
		}
		
	}


