//import java.util.*;
//Passing arrays as arguments

public class ArraysCC {

	public static void up(int marks[]){
		for(int i =0;i<marks.length;i++){
			marks[i] = marks[i] + 1;
		}
	}
	public static void main(String[] args) {
		int marks[] = {98,97,95};
		up(marks);
		
		//To print array
		for(int i =0;i<marks.length;i++){
			System.out.print(marks[i]+ " ");
		}
		System.out.println();

	}
}