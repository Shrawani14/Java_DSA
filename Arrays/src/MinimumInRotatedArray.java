
public class MinimumInRotatedArray {
	 public static int findmin(int num[]){
	    	int start = 0;
	    	int end = num.length-1;
	    	while(start < end){
	    		int mid = (start + end )/2;
	    		if(num[mid]> num[end]){
	    			start = mid + 1;
	    			
	    		}
	    		else if (num[mid] < num[end]){
	    			end = mid;
	    			
	    		}
	    		else{
	    			end --;
	    		}
	    	}
	    	return num[start];
	    }
	public static void main(String[] args) {
		 int num[] = {3,4,5,1,2};
	        System.out.println(findmin(num));

	}

}
