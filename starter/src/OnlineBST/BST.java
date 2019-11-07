package OnlineBST;

public class BST {
	private class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private Node root;
	private int size;

	public BST() {
		this.root = null;
		this.size = 0;
	}

	public void add(int data) {
		if (this.root == null) {
			Node nn = new Node(data, null, null);
			this.root = nn;
		} else {
			this.add(this.root, data);
		}
	}

	private void add(Node node, int data) {
		// TODO Auto-generated method stub
		if (data < node.data) {
			if (node.left != null) {
				this.add(node.left, data);
				
			} else {
				node.left = new Node(data, null, null);
				this.size++;
			}
		} else if (data > node.data) {
			if (node.right != null) {
				this.add(node.right, data);
				;
			} else {
				node.right = new Node(data, null, null);
				this.size++;
			}
		} else {
			add(this.root, data);
		}
	}

	public int min() {
		return this.min(this.root);
	}

	private int min(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return 0;
		}
		if (node.left == null) {
			return node.data;
		} else
			return min(node.left);

	}

	public int max() {
		return this.max(this.root);
	}

	private int max(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return 0;
		}
		if (node.right == null) {
			return node.data;
		} else
			return max(node.right);

	}

	public int sumofAllleaf() {
		return this.sumofAllleaf(this.root);
	}

	private int sumofAllleaf(Node node) {
		if (node == null) {
			return 0;
		}
		if (node.left == null && node.right == null) {
			return node.data;
		}
		int left = sumofAllleaf(node.left);
		int right = sumofAllleaf(node.right);
		int sum = left + right;
		return sum;
	}

	public void rootToLeafPath() {
		this.rootToLeafPath(this.root, "");
	}

	private void rootToLeafPath(Node node, String ans) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			ans = ans + node.data;
			System.out.println(ans);
		}
		rootToLeafPath(node.left, ans + node.data + "=>");
		rootToLeafPath(node.right, ans + node.data + "=>");

	}

	public void remove(int data) {
		this.remove(this.root, data);
	}

	private void remove(Node node, int data) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		else	if (node.data == data) {
			if (node.left == null && node.right == null) {
				node = null;
			} 
			else if (node.left == null) {
				node = node.right ;
			}
			else if (node.right == null) {
				node = node.left;
			} 
			 else {
				int max = this.max(node.left);
				node.data = max;
				this.remove(node.left, max);
			}
		}

		
		else if (data < node.data) {
			if(node.left!=null) {
			remove(node.left, data);
			}
		} else {
			if(node.right!=null) {
			remove(node.right, data);
			}
		}

	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		if (node.left != null) {
			System.out.print(node.left.data + "=>");
		} else {
			System.out.print("END=>");
		}
		System.out.print(node.data);
		if (node.right != null) {
			System.out.print("<=" + node.right.data);
		} else {
			System.out.print("<=END");
		}
		System.out.println();
		display(node.left);
		display(node.right);
	}

}
