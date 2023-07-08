import java.util.Arrays;
//Kth Largest Element in an Array


public class KthLargestElement {

	public static void larg(int nums[], int k){
		 
        Arrays.sort(nums);
        int largest = nums[nums.length - k];
        System.out.println("Kth largest = "+ largest);

	}
	public static void main(String[] args) {
		int nums[] = {3,2,1,5,6,4};
		int k = 2;
//		Arrays.sort(num);
//		int largest = num[num.length - key];
//		for(int i = 0; i< num.length ; i++){
//			System.out.print(num[i]+" ");
//		}
//		System.out.println();
//		System.out.println("Kth Largest="+largest);
		
		larg(nums,k);
		
//		int num[] = {3,2,1,5,6,4};
//        int key = 2;
//        Arrays.sort(num);
//        int Largest = num[num.length - key];
//        System.out.println("Kth largest = ");
		
		
	}

}
