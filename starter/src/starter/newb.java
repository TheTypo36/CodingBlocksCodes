package starter;
class outer{
	int x=20;
	class inner{
		int y=20;
	}
}

public class newb {
public static void main(String args[]) {
	outer myouter=new outer();
	outer.inner myinner=myouter.new inner();
	System.out.println("the sum is "+(myouter.x+myinner.y));
	
} 
	}
