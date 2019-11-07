package starter;

public class N_bits {
	public void binary(int n) {
		int a[]=new int[n];
		for(int i=0;i<=n;i++) {
			a[i]=i;
		}
		if(n>1)
			System.out.println(a);
		else
			a[n-1]=0;
		binary(n-1);
		a[n-1]=1;
		binary(n-1);
	}
public static void main(String args[]) {
	N_bits obj=new N_bits();
	obj.binary(2);
}
}

