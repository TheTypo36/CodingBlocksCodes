package RecursiveProblems;

import java.util.*;

public class CountSsWithAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		System.out.println(getSS(str,"",0));
	}
public static ArrayList<String> getSS(String str){
			if(str.length()==0) {
				ArrayList<String> br=new ArrayList<String>();
				br.add("");
				return br;
			}
			char cc=str.charAt(0);
			ArrayList<String> recur=new ArrayList<String>();
			ArrayList<String> myresult=new ArrayList<String>();
			recur=getSS(str.substring(1));
			for(int i=0;i<recur.size();i++) {
				myresult.add(cc+recur.get(i));
				myresult.add(recur.get(i));
				
				
			}
			return myresult;
		}
		
	

}
