package OnlineHeap;

import java.util.ArrayList;


public class Heap<T extends Comparable<T>> {
	private ArrayList<T> data;
	private boolean isMin;
		public boolean equals(Object ob) {
			
			return this.data.;
			
		}
	public Heap() {
		this(true);
	}

	public Heap(boolean isMin) {
		// TODO Auto-generated constructor stub
		this.data=new ArrayList<T>();
		this.isMin=isMin;
	}
	public int size() {
		return this.data.size();
	}
	public boolean isEmpty() {
		return this.size()==0;
		
	}
	public T getHP() {
		return this.data.get(0);
		
	}
	public void add(T data) {
		this.data.add(data);
		this.unhappify(this.size()-1);
	}

	private void unhappify(int ci) {
		// TODO Auto-generated method stub
		if(ci==0) {
			return ;
			
		}
		int pi=(ci-1)/2;
		if(!LargerThan(ci,pi)) {
			swap(ci,pi);
			unhappify(pi);
		}
		
		
	}

	private void swap(int ci, int pi) {
		// TODO Auto-generated method stub
		
	}

	private boolean LargerThan(int ci, int pi) {
		// TODO Auto-generated method stub
		T pd=this.data.get(pi);
		T cd=this.data.get(ci);
		if(pd.equals(cd)) {
			return true;
		}
		else
	}
}
