package RecursiveProblems;

public class Print5to1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	num(5);
	}
	public static void num(int n) {
		if(n==1)
		{
		System.out.println(1);
	     return;
		}
		 System.out.println(n);
		 num(n-1);
	}

}