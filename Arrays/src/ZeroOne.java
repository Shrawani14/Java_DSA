
public class ZeroOne {

	
	public static void count(int arr[]){
		int countzero = 0;
		int countone =  1 ;
		for(int i = 0 ; i<arr.length-1;i++){
			if(arr[i] == 0){
				countzero++;
			}
			if(arr[i]==1){
				countone++;
			}
			
		}
		System.out.println("No. of zero = "+countzero);
		System.out.println("No. of one = "+countone);
	}
	public static void main(String[] args) {
		int arr[] = {0,1,1,1,0,0,0,0,1,0,1,0,1,0,1};
		count(arr);

	}

}
