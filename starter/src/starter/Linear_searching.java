package starter;
import java.util.*;
public class Linear_searching {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of the ArrayList: ");
		int n=sc.nextInt();
		ArrayList <Integer> myList=new ArrayList <Integer> (n);
		for(int i=0;i<n;i++) {
			//System.out.println("Enter the element "+i+" "+":");
			myList.add(sc.nextInt());
		}
		System.out.println("Enter the number to be Searched: ");
		int number=sc.nextInt();
		int flag=0,index=0;
		for(int i=0;i<n;i++) {
			if(myList.get(i)==number) {
				flag++;
				index=i;
				break;
			}
		}
		if(flag==1)
			System.out.println("The number is found at index of: "+index);
		else
			System.out.println("The number is not present in the list: ");
		
	}
}
