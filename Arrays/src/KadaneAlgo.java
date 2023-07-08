
public class KadaneAlgo {

	public static void Kadane(int num[]){
		int currSum =0;
		int MaxSum = Integer.MIN_VALUE;
		
		for(int i = 0;i<num.length;i++){
			currSum = currSum + num[i];
			if(currSum < 0){
				currSum = 0;
			}
			MaxSum = Math.max(currSum, MaxSum);
		}
		System.out.println("Our max subarray = "+MaxSum);
	}
	public static void main(String[] args) {
		int num[] = {-2,1,-3,4,-1,2,1,-5,4};
		 Kadane(num);
	}

}

//for all negative numbers in array

//class Solution {
//
//    
//    public static int maxSubArray(int[] nums) {
//        int cs = 0;
//        int maxsum = Integer.MIN_VALUE;
//        for(int i = 0; i< nums.length  ; i++){
//            cs = cs + nums[i];
//            if(cs > maxsum){
//            	maxsum = cs;
//            }
//            if(cs<0){
//            	cs =0;
//            }
//            
//            //maxsum = Math.max(cs,maxsum);
//        }
//        System.out.println("Our max subarray = "+maxsum);
//        return maxsum;
//    }
//    public static void main(String args[]){
//        int nums[]= {-2,1,-3,4,-1,2,1,-5,4};
//        maxSubArray(nums) ;
//    }
//}