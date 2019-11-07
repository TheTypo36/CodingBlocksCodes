package starter;

public class LinkListClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       LinkedList list=new LinkedList();
       list.addFront(10);
       list.addLast(20);
       list.addLast(30);
       list.addFront(40);
       list.addFront(50);
       list.display();
     int first=  list.RemoveFirst();
     System.out.println(first);
       list.display();
       int last =list.RemoveLast();
       System.out.println(last);
       list.display();
       int any =list.RemoveAt(1);
       System.out.println(any);
       list.display();
       System.out.println(list.getFirst());
       System.out.println(list.getLast());
       System.out.println(list.getAt(0));
       list.addLast(10);
       list.addLast(30);
       list.display();
       list.reverseData();
       list.display();
       list.addLast(100);
       list.addLast(300);
       list.display();
       list.reversePointer();
       list.display();
       System.out.println(list.mid());
       list.display();
       list.RemoveFirst();
       System.out.println(list.mid());
       list.display();
	}

}
