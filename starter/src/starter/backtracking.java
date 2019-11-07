package starter;

public class backtracking {
 static int a[]= {1,1,1,1,1,2,3,6};
  static void back(int n)
  {
	  if(n<1)
		  System.out.println(a);
	  else
	  {
		a[n-1]=0;
		back(n-1);
		a[n-1]=0;
		back(n-1);
	  }
  }
	  public static void main(String args[])
	  {
		  backtracking sc=new backtracking();
		 sc.back(8);
	
	  }

  
  
}
