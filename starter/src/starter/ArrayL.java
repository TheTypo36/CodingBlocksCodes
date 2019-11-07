package starter;
import java.util.ArrayList;
public class ArrayL {
	public static void main(String args[]) {
		ArrayList<Integer> myList=new ArrayList<Integer>(5);
		myList.add(23);
		myList.add(45);
		myList.add(32);
		myList.add(12);
		myList.add(24);
		for(Integer x: myList)
		{
			System.out.println(x);
		}
		myList.clear();
		
		System.out.println(myList.size());
	}
}
