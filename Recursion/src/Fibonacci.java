
public class Fibonacci {

	public static int fib(int n){
		if(n == 0 || n==1){
			return n;
		}
		int fibnm1 = fib(n-1);
		int fibnm2 = fib(n-2);
		int fibn = fibnm1 + fibnm2;
		
		return fibn;
	}
	public static void main(String[] args) {
		int n = 6;
		System.out.println("fibonacci of "+n+" term = "+fib(n));

	}
//11234567
}
