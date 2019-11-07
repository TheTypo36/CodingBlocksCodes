package starter;
import java.util.*;
public class PascalTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int value=1;
			for(int j=1;j<=i;j++) {
				System.out.print(value+" ");
				value=value*(i-j)/j;
	
			}
			System.out.println();
		}
	}

}
