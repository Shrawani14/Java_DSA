package string;

//import java.util.Scanner;

public class Input {

	public static void printLetters(String str){
		for(int i = 0 ; i<str.length();i++){
			System.out.print(str.charAt(i)+" ");
		}
	}
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String name = sc.nextLine();
//		System.out.println(name);
//		sc.close();
		
//		String name = new String("Hello Everyone");
//		System.out.println(name.length());
//		
		
		//Concatenation
//		String firstname = "Shrawani";
//		String lastname = "Dhomne";
//		String fullname = firstname+" "+lastname;
//		System.out.println(fullname);
		
		
		//charAt
		String firstname = "Shrawani";
		String lastname = "Dhomne";
		String fullname = firstname+" "+lastname;
		System.out.println(fullname.charAt(0));
		
		printLetters(fullname);
	}
	
	
	

}
