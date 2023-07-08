
public class OptimizedPower {

	public static int optimizedPow(int x , int n){
		
		// Basecase
		if(n==0){
			return 1;
		}
		int halfpow = optimizedPow(x ,n/2);
		int halfpowsq = halfpow * halfpow;
		
		//odd
		if(n%2!= 0){
			halfpowsq = x * halfpowsq;
		}
		
		return halfpowsq;
	}
	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		System.out.println("Optimized powewr = "+optimizedPow(x ,n));
	}

}
