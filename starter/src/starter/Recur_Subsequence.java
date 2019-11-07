package starter;
import java.util.*;
public class Recur_Subsequence {
	public static ArrayList<String> getSS(String str){
		if(str.length()==0) {
			ArrayList<String> br=new ArrayList<String>();
			br.add("");
			return br;
		}
		char cc=str.charAt(0);
		ArrayList<String> myResult=new ArrayList<String>();
		ArrayList<String> recurResult=new ArrayList<String>();
		recurResult=getSS(str.substring(1));
		for(int i=0;i<recurResult.size();i++) {
			myResult.add(recurResult.get(i));
			myResult.add(recurResult.get(i)+cc);
		}
		return myResult;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Say something, Damn it!");
		String str=sc.next();
		ArrayList<String> answer=new ArrayList<String>();
		answer=getSS(str);
		for(int i=0;i<answer.size();i++) {
			System.out.print(answer.get(i)+","+"\t");
		}
		}

}
