package starter;
public class Algebra {
	public static void main(String args[])
	{
		double fx=0.0,x;
		for(x=-10;x<=10;x++)
		{
			fx=(x*x+1.5*x+5)/(x-3); 
			System.out.println("The Value of f(x) when value of x is: "+x+"\t"+fx);
		}
	}
}
