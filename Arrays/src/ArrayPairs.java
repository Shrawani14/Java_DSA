
public class ArrayPairs {

	public static void pair(int num[]){
		
		int TC = 0;
		
		for(int i = 0;i<num.length;i++){
			int current = num[i];
			for(int j = i+1;j<num.length;j++){
				System.out.print("("+current+","+num[j]+")");
				TC++;
			}
			System.out.println();
			
		}
		System.out.println("Total count = "+TC);
	}
	public static void main(String[] args) {
		int num[] = {2,4,6,8,10}; 

		pair(num);
	}

}
