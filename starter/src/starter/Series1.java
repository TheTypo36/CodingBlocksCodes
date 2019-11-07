package starter;
import java.util.*;
public class Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N1=0,N2=0,n=0;
	
		N1=sc.nextInt();
		
		N2=sc.nextInt();
		for(int i=1;i<=N1;i++) {
			n++;
			int pr=(3*n+2);
			if((pr%N2)!=0) {
				System.out.println(pr);
			}
			else {
				i--;
			}
			}
		}
	}


