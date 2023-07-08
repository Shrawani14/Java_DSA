package string;

public class ReverseString {

	public static void reverse(String str){
		String newStr = "";
		for( int  i = 0; i<str.length() ; i++){
			char ch = str.charAt(i);
			newStr = ch + newStr;
		}
		System.out.print(newStr);
	}
	public static void main(String[] args) {
		String str = "hello";
		reverse(str);

	}

}
