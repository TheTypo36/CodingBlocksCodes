package starter;

public class Mainclass3 {
public static void main(String args[]) {
	cube c1=new cube();
	System.out.println("The volumn of the cube is: "+c1.getTheVolumn());
	cube c2=new cube(50,60,70);
	System.out.println("The volumn of the cube is: "+c2.getTheVolumn());
}
}
