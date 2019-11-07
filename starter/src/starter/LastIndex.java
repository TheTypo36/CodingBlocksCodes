package starter;
import java.util.*;
public class LastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,8,1,8,8,4};
//		System.out.println(lastindex(arr,0,8));
//		System.out.println("********************************************************");
//		int[] newarr=allIndices(arr, 0, 8, 0);
//		for(int i=0;i<newarr.length;i++) {
//			System.out.print(newarr[i]+"  ");
//		}
//		System.out.println();
//		System.out.println("*********************************************************");
//		ArrayList<String> ans=new ArrayList<String>();
//		ans=getSS("ab");
//		Collections.sort(ans);
//		display(ans);
//		System.out.println("*********************************************************");
		ArrayList<String> answer=new ArrayList<String>();
		answer=getPermutation("cab");
		System.out.println((answer));
//		System.out.println("*******************************************************");
//		System.out.print(getBoardPath(0,10));
//		System.out.println();
//		System.out.println("********************************************************");
//		System.out.println(getMazePath(2,2,0,0));
//		System.out.println("*********************************************************");
//		ArrayList<String> re=getMazePathDia(2, 2, 0, 0);
//		System.out.println(re);
//		System.out.println(re.size());
//		System.out.println("*******************************************************");
//		printSS("ab","");
//		System.out.println();
//		System.out.println("****************************************************");
//		printSSWithAscii("abc", "");
//		System.out.println();
//		System.out.println("***************************************************");
//		printPermutation("abc", "");
//		System.out.println();
//		System.out.println("*******************************************************");
//		printBoardPath(0, 10, "");
	}
	public static void display(ArrayList<String> arr) {
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
	}
	public static int lastindex(int[] arr,int si,int data) {
		int index=0;
		if(si==arr.length) {
			return -1;
		}
		index=lastindex(arr,si+1,data);
		if(index==-1) {
		if(arr[si]==data) {
			return si;
		}
		else 
			return -1;
		}
		return index;
	}
	
	public static int[] allIndices(int[] arr,int si,int data,int count) {
		int[] indices=null;
		if(si==arr.length) {
			int[] br=new int[count];
			return br;
		}
		if(arr[si]==data) {
		indices=allIndices(arr, si+1, data, count+1);
		}
		else
		{
			indices=allIndices(arr, si+1, data, count);
		}
		if(arr[si]==data) {
			indices[count]=si;
		}
		return indices;
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
	public static ArrayList<String> getPermutation(String str){
		if(str.length()==0) {
			ArrayList<String> br=new ArrayList<String>();
			br.add("");
			return br;
		}
		char cc=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> recur=new ArrayList<String>();
		ArrayList<String> myresult=new ArrayList<String>();
		recur=getPermutation(ros);
		for(String rss:recur) {
		for(int j=1;j<=rss.length();j++) {
		 String val=rss.substring(0,j)+cc+rss.substring(j);
		myresult.add(val);
		}
		}
		return myresult;
	}	
	public static ArrayList<String> getBoardPath(int c,int end){
		if(c==end) {
			ArrayList<String> br=new ArrayList<String>();
			br.add("");
			return br;
		}
		if(c>end)
		{
			ArrayList<String> br=new ArrayList<String>();
			return br;
		}
		
		ArrayList<String> recur=new ArrayList<String>();
		ArrayList<String> myresult= new ArrayList<String>();
		
		for(int i=1;i<=6;i++) {
			
			recur=getBoardPath(c+i, end);
			for(String rrs:recur) {
				
			
			String val=i+rrs;
			myresult.add(val);
		}
		}
		return myresult;
	}
	public static ArrayList<String> getMazePath(int er, int ec, int cr, int cc) {
		if(cr==er&&cc==ec) {
			ArrayList<String> br=new ArrayList<String>();
			br.add("");
			return br;
		}
		if(cr>er||cc>ec) {
			ArrayList<String> br=new ArrayList<String>();
			return br;
		}
	   ArrayList<String> Hm=getMazePath(er, ec, cr, cc+1);
	   ArrayList<String> Vm=getMazePath(er, ec, cr+1, cc);
	   ArrayList<String> myResult=new ArrayList<String>();
	   for(String rss:Hm) {
		   myResult.add('H'+rss);
	   }
	   for(String rss:Vm) {
		   myResult.add('V'+rss);
	   }

	   return myResult;
	   
	}
	public static ArrayList<String> getMazePathDia(int er,int ec,int cr,int cc) {
		if(cr==er&&cc==ec) {
			ArrayList<String> br=new ArrayList<String>();
			br.add("");
			return br;
		}
		if(cr>er||cc>ec) {
			ArrayList<String> br=new ArrayList<String>();
			return br;
		}
	   ArrayList<String> hm=getMazePathDia(er, ec, cr, cc+1);
	   ArrayList<String> vm=getMazePathDia(er, ec, cr+1, cc);
	   ArrayList<String> dm=getMazePathDia(er, ec, cr+1, cc+1);
	   ArrayList<String> myresult=new ArrayList<String>();
	   for(String rss:hm) {
		   myresult.add('H'+rss);
	   }
	   for(String rss:vm) {
		   myresult.add('V'+rss);
	   }

	   for(String rss:dm) {
		   myresult.add('D'+rss);
	   }
	   return myresult;
	   
	}
	public static void printSS(String str,String res)
	{
		if(str.length()==0) {
			
			System.out.println(res);
			return;
		}
		char cc=str.charAt(0);
		String ros=str.substring(1);
		printSS(ros,res);
		printSS(ros,res+cc);
		printSS(ros,res+(int)cc);
		
		
		
	
		}
	public static void printSSWithAscii(String str,String res) {
		if(str.length()==0) {
		for(int i=0;i<res.length();i++) {
			System.out.print((int)res.charAt(i)+",  ");
			}
			return;
		}
		char cc=str.charAt(0);
		String ros=str.substring(1);
		printSSWithAscii(ros, res);
		printSSWithAscii(ros,res+cc);
	}
	public static void printPermutation(String str,String ans) {
		if(str.length()==0) {
			System.out.print(ans+",  ");
			return;
		}
		for(int i=0;i<str.length();i++) {
			char cc=str.charAt(i);
			String ros=str.substring(0,i)+str.substring(i+1);
			printPermutation(ros, cc+ans);
		}
	}
	public static void printBoardPath(int cc,int end,String res) {
		if(cc==end) {
			System.out.print(res+  ",  ");
			return;
		}
		if(cc>end)
			return;
		for(int i=1;i<6;i++) {
			printBoardPath(cc+i, end, i+res);
		}
			
			
		}
	}
	
