package starter;
import java.util.*;
public class D_I_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int n=sc.nextInt(),p=0;
		String[] arr=new String[n];
		String str="";
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
		}
		for(int i=0;i<n;i++) {
			str=arr[i];
			if(str.charAt(0)=='I') {
			str=arr[i]+'I';
			 p=1;
			do{
				System.out.print(p);
				p++;
				str=str.substring(1);
			}
			while(str.length()!=0) ;
			System.out.println();
			}
			else 
			{
				str=str+'D';
				p=str.length();
				while(str.length()!=0) {
					System.out.print(p);
					p--;
					str=str.substring(1);
				}
				System.out.println();
			}
		
	}

}
}