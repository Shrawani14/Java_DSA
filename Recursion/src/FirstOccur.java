
public class FirstOccur {

	public static int FO(int arr[], int key , int i){
		if(i == arr.length){
			return -1;
		}
		if(arr[i] == key){
			return i;
		}
		return FO(arr,5,i+1);
	}
	public static void main(String[] args) {
		int arr[] = {8,3,6,9,5,10,2,5,3};
		System.out.println("First Occurence = "+FO(arr,5,0));

	}

}
