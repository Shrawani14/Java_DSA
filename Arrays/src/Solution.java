import java.util.Arrays;

class Solution {
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //check lenght 
        if(str1.length() == str2.length()){

            //convert to array
            char array1[] = str1.toCharArray();
            char array2[] = str2.toCharArray();

            boolean result = Arrays.equals(array1, array2);
            if(result){
					return true;
				}
				else{
					return false;
				}
				
			}
        else{
        	
        
			return false;

        }
    
	}
    
   public static void main(String[] args){
        String str1 = "race";
        String str2 = "care";
        isAnagram( str1 ,  str2);
    }
}