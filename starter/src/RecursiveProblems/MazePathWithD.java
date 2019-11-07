package RecursiveProblems;
import java.util.*;
public class MazePathWithD {

	
	    public static void main(String args[]) {
	        // Your Code Here
			Scanner sc=new Scanner(System.in);
			int er=sc.nextInt();
			int ec=er;
			ArrayList<String> str=getMazePathDia(er,ec,1,1);
			for(String rss:str)
			System.out.print(rss+" ");
			System.out.println();
			System.out.println(countMazePath(er,ec,1,1));

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
		     for(String rss:vm) {
			   myresult.add('V'+rss);
		   }
		   for(String rss:hm) {
			   myresult.add('H'+rss);
		   }
		 

		   for(String rss:dm) {
			   myresult.add('D'+rss);
		   }
		   return myresult;
		   
		}
		public static int countMazePath(int er, int ec, int cr, int cc) {
			if (cr == er && cc == ec) {
				return 1;
			}
			if (cr > er || cc > ec) {
				return 0;
			}
			int mycount = 0;
			mycount = countMazePath(er, ec, cr, cc + 1);
			mycount= mycount+countMazePath(er, ec, cr + 1, cc);
			if (cr == cc || (cr + cc) == er) {
			mycount=mycount+ countMazePath(er,ec,cr+1,cc+1);
			}
			return mycount;
		}
	}


