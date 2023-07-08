package string;

public class Example {

	public static boolean pallindrome(String str){
		for(int i = 0; i<str.length();i++){
			if(Character.isDigit(i) || Character.isLetter(i)){
				str+= i;
			}
			if(str.charAt(i) != str.charAt(str.length()-1-i)){
				return false;
			}
			i++;
			
	}
		return true;
	}
	public static void main(String[] args) {
		String str = "A man, a plan, a canal: Panama";
		System.out.println(pallindrome( str));
	}

}
