import java.util.Scanner;


public class Duplicate {

	public static boolean duplicateNum(int arr[]){
		int n  = arr.length;
		for(int i = 0; i< n-1;i++){
			for(int j = i+1; j<n;j++){
				if(arr[i]== arr[j]){
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array= ");
		int len = sc.nextInt();
		int arr[] = new int[len];
		for(int i = 0; i<len;i++){
			arr[i] = sc.nextInt();
			sc.close();
		}
		
		
		//int arr[] = {1,2,3,4};
		System.out.println(duplicateNum( arr));
	}

}
