package OnlineBST;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bst=new BST();
		bst.add(50);
		bst.add(25);
		bst.add(75);
		bst.add(12);
		bst.add(37);
		bst.add(62);
		bst.add(87);
		
		System.out.println(bst.min());
		System.out.println("*****************************");
		System.out.println(bst.max());
		System.out.println("*****************************");
		System.out.println(bst.sumofAllleaf());
		System.out.println("*****************************");
		bst.rootToLeafPath();
		System.out.println("*****************************");
		bst.display();
		bst.remove(12);
		System.out.println("*****************************");
		bst.display();

	}

}
