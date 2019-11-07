package starter;
import java.util.*;
public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		        int[][] arr = new int[6][6];

		        for (int i = 0; i < 6; i++) {
		    

		            for (int j = 0; j < 6; j++) {
		            	System.out.println("Enter the array in row "+i+" and column "+j);
		            	arr[i][j]=sc.nextInt();
	}
		        }
			        for (int p = 0; p < 6; p++) {
					    

			            for (int k = 0; k < 6; k++) {
			            	System.out.print(arr[p][k]+" ");
			            }
			            System.out.println();
			        
		}
		            


	
		        int max=0,sum=0;
		        for (int i = 0; i < 6; i++) {
				    

		            for (int j = 0; j < 6; j++) {
		            	if(i<=3&&j<=3) {
		            		sum=sum+arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
		            	}
		            	if(sum>max)
		            	{
		            		max=sum;
		            	}
		            }
		        }
		        System.out.println(max);
	}
}
