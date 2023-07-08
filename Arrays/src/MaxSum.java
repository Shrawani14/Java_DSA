
public class MaxSum {

	public static void maxSubarray(int num[]){
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i =0;i<num.length;i++){
			int start = i;
			for(int j =i;j<num.length;j++){
				int end = j;
				currSum = 0;
				for(int k = start; k<=end;k++){
					//subarray sum 
					currSum += num[k];
				}
				System.out.println(currSum);
				if(maxSum < currSum){
					maxSum = currSum;
				}
			}
		}
		System.out.println("maxsum = "+ maxSum);
	}

	public static void main(String[] args) {
		//int num[] = {1,-2,6,-1,3};\
	int num[] = {5,4,-1,7,8};
		maxSubarray(num);
	}

}
