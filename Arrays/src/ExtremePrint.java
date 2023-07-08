
public class ExtremePrint {

	public static void extreme(int arr[]){
		int start = 0;
		int end = arr.length - 14;
		
		for(int i = start ; i<=end;i++){
			if(start< end){
				System.out.print(arr[start]+" ");
				System.out.print(arr[end]+" ");
				start++;
				end--;
			}
			if(start == end ){
				System.out.print(arr[end]+" ");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		extreme(arr);
	}

}
