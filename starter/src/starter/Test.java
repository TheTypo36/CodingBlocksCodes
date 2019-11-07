package starter;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=0;
		System.out.println("Enter the choice and the choice should between 1 to 3");
		a=sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("ashish Raghuvanshi");
			break;
		case 2:
			System.out.println("anand Raghuvanshi");
			break;
		case 3:
			System.out.println("vipin Raghuvanshi");
			break;
		 default:
			 System.out.println("Wrong choice");
		}
	}

}
