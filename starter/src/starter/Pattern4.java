package starter;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k=1,p;
		for(i=5;i>=1;i--) {
			for(p=1;p<=k;p++) {
				System.out.print(" ");
			}
			for(j=i;j>=1;j--)
			{
				System.out.print(j+" "); 
			} 
			System.out.println();
			k=k+2;
		}
	}

}
