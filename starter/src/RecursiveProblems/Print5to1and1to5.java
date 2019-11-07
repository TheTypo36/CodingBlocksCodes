package RecursiveProblems;

public class Print5to1and1to5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Pdi(5);
	}
	public static void Pdi(int n) {
  if(n==0)
	  return;
  System.out.println(n);
  Pdi(n-1);
  System.out.println(n);
}
}
