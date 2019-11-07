package starter;

import java.util.Scanner;

public class Smallerofgreater {

	public static void main(String args[]) throws Exception {
		// Your Code Here
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		while(t-- > 0){
    		
    		int N=s.nextInt();
    		int[] nums=new int[N];
    		for(int i=0;i<N;i++){
    			nums[i]=s.nextInt();
    		}
            
    		Smallerofgreater obj = new Smallerofgreater();
            StacksUsingArrays stack = obj.new StacksUsingArrays();
    		int[] ans=NextGreater(nums, stack);
    		for(int i=0;i<ans.length;i++){
    			System.out.print(ans[i]+" ");
    		}
    // 		System.out.println();
		}

	}

	public static int[] NextGreater(int[] nums,StacksUsingArrays stack) throws Exception {
        int ans[]=new int[nums.length];
		for(int i=0;i<nums.length;i++){
			if(i==nums.length-1){
				stack.push(-1);
			}
			else{
				int catching=0;
				for(int j=i;j<nums.length;j++){
				if(nums[j]>nums[i]){
					for(int k=j;k<nums.length;k++){
						if(nums[j]>nums[k]){
					catching=nums[k];
					break;
						}
				}
				}
				}
				if(catching!=0){
					stack.push(catching);
				}
				else{
					stack.push(-1);
				}

			}
		
			ans[i]=stack.pop();
		}
		return ans;	
		}
	
      //Write your code here
	

	private class StacksUsingArrays {
		private int[] data;
		private int tos;

		public static final int DEFAULT_CAPACITY = 10;

		public StacksUsingArrays() throws Exception {
			// TODO Auto-generated constructor stub
			this(DEFAULT_CAPACITY);
		}

		public StacksUsingArrays(int capacity) throws Exception {
			if (capacity <= 0) {
				System.out.println("Invalid Capacity");
			}
			this.data = new int[capacity];
			this.tos = -1;
		}

		public int size() {
			return this.tos + 1;
		}

		public boolean isEmpty() {
			if (this.size() == 0) {
				return true;
			} else {
				return false;
			}
		}

		public void push(int item) throws Exception {
			if (this.size() == this.data.length) {
				throw new Exception("Stack is Full");
			}
			this.tos++;
			this.data[this.tos] = item;
		}

		public int pop() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			this.data[this.tos] = 0;
			this.tos--;
			return retVal;
		}

		public int top() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			return retVal;
		}

		public void display() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			for (int i = this.tos; i >= 0; i--) {
				System.out.println(this.data[i]);
			}

		}

	}

}

