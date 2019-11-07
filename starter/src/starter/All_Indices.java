package starter;

public class All_Indices {
	public static int[] Allindices(int arr[],int n,int si,int count) {
		if(si==arr.length-1) {
			int[] br=new int[count];
					return br;
		}
		int[] restans=null;
		if(arr[si]==n) {
			restans=Allindices(arr,n,si+1,count+1);
		}
		else
			restans=Allindices(arr,n,si+1,count);
			if(arr[si]==n) {
				restans[count]=si;
			}
			return restans;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr= {1,8,3,8,8,4};
			int[] newarr=null;
			newarr=Allindices(arr,8,0,0);
			for(int i=0;i<newarr.length;i++) {
				System.out.println(newarr[i]);
			}
	}

}
