package string;

import java.util.Arrays;

public class Question {

	public static void anagram(String str1 , String str2){
		
		
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
			
			//check if length are same
			if(str1.length() == str2.length())
			{
				//convert to array
				char array1[] = str1.toCharArray();
				char array2[] = str2.toCharArray();
				
				//sort array
				Arrays.sort(array1);
				Arrays.sort(array2);
				
				boolean result = Arrays.equals(array1, array2);
				if(result){
					System.out.println(str1+ " and "+str2 + " are anagrams");
				}
				else{
					System.out.println(str1+ " and "+str2 + " are not anagrams");
				}
				
			}
			else{
				System.out.println(str1+ "and"+str2 + " are not anagrams");
				
			}
			
		}
	
	public static void main(String[] args) {

		//Anagrams
		String str1 = "race";
		String str2 = "care";
		
		anagram( str1 ,  str2);
	}

}
