
public class Print {
	
	//Decreasing order
//		public static void print(int n){
//			//Base case
//			if(n == 1){
//				System.out.println(1);
//				return;
//			}
//			System.out.print(n+" ");
//			print(n-1);
//		}
	
	//Increasing order
	public static void print(int n){
		//Base case
		if(n == 1){
			System.out.print(1+" ");
			return;
		}
		print(n-1);
		System.out.print(n+" ");
		
	}
	public static void main(String[] args) {
		int n = 5;
		print(n);
	}

}
