package starter;
import java.util.*;
public class Arraylist {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		 ArrayList<Integer> list=new ArrayList<Integer>();
		 ArrayList<Integer> list1=new ArrayList<Integer>();
		 ArrayList<Integer> list2=new ArrayList<Integer>();
		System.out.println("entera");
	int t=sc.nextInt();
	int ts=0,l=0;
	while(t>0) {
		while(ts==0){
			int p=sc.nextInt();
			list.add(p);
			if(p==-1)
				break;
			l++;
			}
		
		list.remove(l);
        for(int i=l-2;i>=0;i-=2) {
        	list1.add(list.get(i));
        	list2.add(list.get(i+1));
        	if(i==1) {
        	list2.add(1);
        	}
        	
        }
        for(int i:list2) {
        	System.out.print(i+" ");
        }
        System.out.println();
        for(int i:list1) {
        	System.out.print(i+" ");
        }
	}
		}
    }
