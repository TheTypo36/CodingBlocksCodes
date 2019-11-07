package RecursiveProblems;

import java.util.Scanner;

public class Dic_Order_smaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            String str=sc.next();
            printPermutaion(str, str, "");
	}
	public static void printPermutaion(String str,String ori,String ans) {
		if(str.length()==0) {
			if(ans.compareTo(ori)>0) {
				System.out.println(ans);
			}
			return;
		}
		
			for(int i=0;i<str.length();i++) {
				char cc=str.charAt(i);
				String ros=str.substring(0,i)+str.substring(i+1);
				printPermutaion(ros, ori, ans+cc);
			}
		}
	}

