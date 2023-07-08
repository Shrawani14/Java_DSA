//check if string is pallindrome or not
package string;

public class Pallindrome {

	public static boolean palind(String str){
		for(int i = 0; i<str.length()/2;i++){
			int n = str.length();
			if(str.charAt(i) != str.charAt(n-1-i)){
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		String str = "shrawani";
		
		System.out.println(palind(str));
	}

}
