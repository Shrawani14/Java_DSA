

public class LargestNum {

	public static int getLargest(int number[]){
		int Largest = Integer.MIN_VALUE; // -infinity
		int smallest = Integer.MAX_VALUE; //
		for(int i = 0;i<number.length;i++){
			if(Largest < number[i]){
				Largest = number[i];
			}
			if(smallest > number[i]){
				smallest = number[i];
			}
		}
		System.out.println("Smallest value is = "+smallest);
		return Largest; 
			
		
	}
	public static void main(String[] args) {
		
		int number[] = {2,3,6,5,4};
		
		System.out.println("Largest number is = "+getLargest(number));

	}

}
