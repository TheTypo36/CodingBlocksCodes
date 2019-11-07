package RecursiveProblems;
import java.util.*;
public class Getssinorder {

	    static void printSubSeqRec(String str, int n, 
								int index, String curr) 
		{ 
	 
			if (index == n) 
			{ 
				return; 
			} 
			System.out.println(curr); 
			for (int i = index + 1; i < n; i++) 
			{ 
				curr += str.charAt(i); 
				printSubSeqRec(str, n, i, curr); 

			
				curr = curr.substring(0, curr.length() - 1); 
			} 
		} 

		 
		static void printSubSeq(String str) 
		{ 
			int index = -1; 
			String curr = ""; 

			printSubSeqRec(str, str.length(), index, curr); 
		} 
	 
		public static void main(String[] args) 
		{ 
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			while(t>0)
		 	 {
			String str =sc.next(); 
			printSubSeq(str);
			t--; 
			  }
		} 
	} 

