
//search element in rotated sorted array                                                                                                        
public class Rotate {

	public static int rotateSearch(int arr[], int target){
		int n = arr.length;
		int low = 0 ;
		int high = n- 1;
		while(low <= high){
			int mid = (low+high)/2;
			if(arr[mid] == target ){
				return mid;
			}
			// left part sorted
			if(arr[low]<= arr[mid]){
				if(arr[low] <= target && arr[mid] >= target){
					high = mid -1;
				}
				else{
					low = mid +1;
				}
			}
			//right part sorted
			else{
				if(arr[mid] <= target && target <= arr[high]){
					low = mid +1;
				}
				else{
					high = mid - 1;
				}
			}
			
			
		}
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		int arr[] = {4,5,6,7,0,1,2};
		int target = 3;
		System.out.println("Target is present at index"+rotateSearch(arr,target));
	}

}
