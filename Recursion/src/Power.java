
public class Power {

	public static int pow(int x , int n){
		if(n== 0){
			return 1;
		}
		int xnm1 =pow(x, n-1);
		int xn = x * xnm1;
		return xn;
	}
	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		System.out.println(pow(x , n));
	}

}
