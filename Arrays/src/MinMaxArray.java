
public class MinMaxArray {

	public static int maximum(int arr[]){
		int largest = Integer.MIN_VALUE;
		for(int i =0 ;i<arr.length;i++){
			if(largest < arr[i]){
				largest = arr[i];
			}
		}
		return largest;
	}
	public static int minimum(int arr[]){
		int smallest = Integer.MAX_VALUE;
		for(int i =0 ;i<arr.length;i++){
			if(smallest > arr[i]){
				smallest = arr[i];
			}
		}
		return smallest;
	}

	public static void main(String[] args) {
		int arr[] = {3, 5, 4, 1, 9};
		System.out.println(" Minimum = "+minimum(arr));
		System.out.println(" Maximum = "+maximum(arr));
		
		
	}
}