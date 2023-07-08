package string;

//CounthowmanytimeslowercasevowelsoccurredinaStringenteredbytheuser
import java.util.Scanner;

public class CountVowels {
	public static void count(String str){
		int countvow = 0;
		int consonants = 0;
		int whitespace = 0;
		
		//convert string to lower case
		for(int i = 0 ;i<str.length();i++){
			str =  str.toLowerCase();
		}
		for(int i = 0;i<str.length();i++){
			char ch = str.charAt(i);
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u'  ){
				countvow++;
			}
			else if(ch >='a' && ch<='z'){
				consonants++;
			}
			else if(ch == ' '){
				whitespace++;
			}
			
		}
		System.out.println("vowels = "+countvow);
		System.out.println("Consonants = "+consonants);
		System.out.println("whitespace= "+whitespace);
	}

	public static void main(String[] args) {
		System.out.print("Enter string = ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		count(str);
		sc.close();
	}

}
