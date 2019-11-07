package OnlineDP;

public class Fib_DP {
	public static long start;
	public static long end;

	public static void startalgo() {
		start = System.currentTimeMillis();
	}

	public static long endalgo() {
		end = System.currentTimeMillis();
		return end - start;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 45;
		int[] strg = new int[n + 1];
		startalgo();
		System.out.println(fiboIs(n));
		System.out.println("Time taken by storage Iteration  " + endalgo() + " ms");
		startalgo();
		System.out.println(fiboRs(n, strg));
		System.out.println("Time taken by storage recursion " + endalgo() + " ms");
	}

	public static int fibo(int n) {
		if (n == 1 || n == 0) {
			return n;
		}
		return fibo(n - 1) + fibo(n - 2);
	}

	public static int fiboRs(int n, int[] strg) {
		if (n == 1 || n == 0) {
			return n;
		}
		if (strg[n] != 0) {
			return strg[n];
		}
		int fn = fiboRs(n - 1, strg) + fiboRs(n - 2, strg);
		strg[n] = fn;
		return fn;
	}

	public static int fiboIs(int n) {
		int[] strg = new int[n + 1];

		strg[0] = 0;
		strg[1] = 1;
		for (int i = 2; i <= n; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
			
		}
		return strg[n];
	}

}
