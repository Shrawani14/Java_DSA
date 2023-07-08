//1.	Find the unique element of an array (XOR ), every element occurs twice except one find it.
public class XOR {

	public static void xor(int arr[]){
		int value = 0 ;
		for(int i = 0 ;i<arr.length;i++){
			value = value^arr[i];
		}
		System.out.println("unique value = "+value);
	}
	public static void main(String[] args) {
		int arr[] = {1,2,4,2,1,3,6,5,5,6,4};
		xor(arr);
	}

}
