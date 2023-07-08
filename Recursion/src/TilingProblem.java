
public class TilingProblem {

	public static int tilling(int n){
		//base case
		if(n==0 || n==1){
			return 1;
		}
		
		//kaam
		//verticle
		int fnm1 = tilling( n -1);
		
		//horizontal 
		int fnm2 = tilling( n -2);
		
		int totways = fnm1 + fnm2;
		return totways;
	}
	public static void main(String[] args) {
		System.out.println(tilling(4));

	}

}
