package string;

public class SubString {

	public static String subString(String str , int si , int ei){
		String substr = ""; //empty string banaya
		for(int i = si; i<ei ;i++){
			substr += str.charAt(i);
		}
		return substr;
	}
	public static void main(String[] args) {
	String str = "Hello world";
	//System.out.println(subString(str,0,7));
	System.out.println(str.substring(0,7));
	System.out.println(str.subSequence(3, 7));
	}

}
