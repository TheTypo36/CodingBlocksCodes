package RecursiveProblems;
import java.util.*;
public class StringToint {

	  public static void main(String args[]) {
	        // Your Code Here
			Scanner sc=new Scanner(System.in);
			String str=sc.next();
			// TODO Auto-generated method stub
				int arr=getInteger(str,0);
				
			System.out.println(arr);
		
	    }
		public static int getInteger(String str,int recur){
			if(str.length()==0) {
				return recur;
			}
			int cc=Integer.parseInt(str.substring(0,1));
			String ros=str.substring(1);
			int myans=0;
			recur=recur+((int)Math.pow(10, ros.length())*cc);
			return getInteger(ros,recur);
			
			
			
			
		}	
	}
