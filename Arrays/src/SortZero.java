
public class SortZero {

	public static void sort(int arr[]){
		int n = arr.length;
		int count = 0;
		for(int i = 0 ; i<n ; i++){
			if(arr[i] == 0 ){
				count++;
			}
		}
		for(int i = 0; i<count ; i++){
			arr[i] = 0;
		}
		for(int i = count ;i<n ; i++){
			arr[i] =1;
		}
		
	}
	public static void main(String[] args) {
		int arr[] = {0,1,1,0,1,0,1,0,0};

		sort(arr);
		for(int i = 0; i<arr.length ; i++)
		{	
			System.out.print(arr[i]+" ");
		}
		
	}
}
