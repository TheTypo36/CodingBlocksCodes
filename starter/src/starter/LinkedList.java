package starter;

public class LinkedList {
   protected class Node{
	   int data;
	   Node next;
   }
   private Node head;
   private Node tail;
   private int size;
   
   public void display() {
	   System.out.println("------------------------------");
	   Node temp=this.head;
	   while(temp!=null) {
		   System.out.print(temp.data+", ");
		   temp=temp.next;
	   }
	   System.out.println("END");
	   System.out.println("------------------------------");
   }
  
   	public void addLast(int item) {
   		//creating new node
   		Node nn=new Node();
   		nn.data=item;
   		nn.next=null;
   		
   			//attaching the last node
   		if(this.size>=1) {
   			this.tail.next=nn;
   		}
   		
   	//updating the value of summary objects
   		if(this.size==0) {
   			this.head=nn;
   			this.tail=nn;
   			this.size++;
   		}
   		else
   		{
   			this.tail=nn;
   			this.size++;
   		}
   		
   	
   	}
   	public void addFront(int item) {
   		Node nn=new Node();
   		nn.data=item;
   		nn.next=null;
   		
   		//attaching the new node
   		
   		if(this.size>=1) {
   			nn.next=this.head;
   		}
   		//updating summary object
   		if(this.size==0) {
   			this.head=nn;
   			this.tail=nn;
   			this.size++;
   		}
   		else
   		{
   			this.head=nn;
   			this.size++;
   		}
   		
   	}
   	public int getFirst() throws Exception {
   		if(size==0) {
   			throw new Exception("LL is empty!");
   		}
   		return this.head.data;
   	}
   	public int getLast() throws Exception{
   		if(size==0) {
   			throw new Exception("LL is empty.");
   		}
   		return this.tail.data;
   	}
   public int getAt(int index) throws Exception {
	   if(size==0) {
		   throw new Exception("LL is empty!");
	   }
	   if(index<0||index>=size) {
		   throw new Exception("Invalid Index");
	   }
		   Node temp=this.head;
		   for(int i=1;i<=index;i++) {
			   temp=temp.next;
		   }
		   return temp.data;
	   }
   	private Node getNodeAt(int index) throws Exception {
	   if(size==0) {
		   throw new Exception("LL is empty!");
	   }
	   if(index<0||index>=size) {
		   throw new Exception("Invalid Index");
	   }
		   Node temp=this.head;
		   for(int i=1;i<=index;i++) {
			   temp=temp.next;
		   }
		   return temp;
	   }
   	private void addNode(int index,int item) throws Exception {
   		if(index<0||index>size) {
   			throw new Exception("invalid index");
   		}
   		
   		if(index==0) {
   			addFront(item);
   		}
   		else if(index==this.size) {
   			addLast(item);
   		}
   		else {
   			//creating new node
   			Node nn=new Node();
   			nn.data=item;
   			nn.next=null;
   			
   			//attaching new mode
   			Node nm1=getNodeAt(index-1);
   			Node np1=nm1.next;
   			nm1.next=nn;
   			nn.next=np1;
   			
   			//updating the summary object`
   			size++;
   		}
   	}
   	public int RemoveFirst()throws Exception {
		
			if(this.size==0) {
				throw new Exception("the list is empty.");
				
			}
		 int rv=this.head.data;
			if(size==1) {
			
			this.head=null;
			this.tail=null;
			this.size=0;
			}
			else
			{
			this.head=this.head.next;
			size--;
			}
			return rv;
		}
   	public int RemoveLast() throws Exception{
   		if(size==0) {
   			throw new Exception("The list in empty.");
   		}
   		int rv=this.tail.data;
   		if(size==1) {
   			this.head=null;
   			this.tail=null;
   			this.size=0;
   			
   		}
   		else {
   			this.tail=getNodeAt(size-2);
   			this.tail.next=null;
   			this.size--;
   		}
   	 	return rv;
   	}
   	public int RemoveAt(int index) throws Exception {
   		
		if(size==0) {
   			throw new Exception("The list in empty.");
   		}
		if(index<0||index>=size) {
   			throw new Exception("invalid index");
   		}
		if(index==0) {
			return RemoveFirst();
		}
		else if(index==this.size-1) {
			 return RemoveLast();
		}
		else
		{
			Node nm1=getNodeAt(index-1);
			Node nn=nm1.next;
			
			Node np1=nn.next;
			nm1.next=np1;
			size--;
			return nn.data;
		}
   	}
   	public void reverseData() throws Exception {
   		int left=0,right=this.size-1;
   		while(left<right) {
   			
   			Node ln=getNodeAt(left);
   			Node rn=getNodeAt(right);
   			
   			int temp=ln.data;
   			ln.data=rn.data;
   			rn.data=temp;
   			
   			left++;
   			right--;
   			
   		}
   		
   	}
   	public void reversePointer() {
			
   		Node prev=this.head;
   		Node curr=prev.next;
   		while(curr!=null) {
   			Node ahead=curr.next;
   			curr.next=prev;
   			
   			prev=curr;
   			curr=ahead;
   		}
   		
   		Node t=this.head;
   		this.head=this.tail;
   		this.tail=t;
   		
   		this.tail.next=null;
   		
		}
   	
   	public int mid() {
   		Node slow=this.head;
   		Node fast=this.head;
   		while(fast.next!=null&&fast.next.next!=null) {
   			slow=slow.next;
   			fast=fast.next.next;
   		}
   		return slow.data;
   	}
   
  }


