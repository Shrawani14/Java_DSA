
public class SumOfNaturalNum {

	public static int sum(int n){
		if(n==1){
			return 1;
		}
		int Snm1= sum(n-1);
		int Sn = n + Snm1;
		
		
		return Sn;
	}
	public static void main(String[] args) {
		int n = 5;
		System.out.println("Sum of n natural no. = "+sum(n));

	}

}
