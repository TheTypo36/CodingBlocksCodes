package starter;
import java.util.Scanner;
public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int l=str.length();
		str=str+" ";
		String newStr="";
		for(int i=0;i<l;i++) {
			while(str.charAt(i)==str.charAt(i+1))
			{
				i++;
				
			}
			
			
				newStr=newStr+str.charAt(i);
			
		}
		System.out.println(newStr);
	}

}
