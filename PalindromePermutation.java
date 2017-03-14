import java.util.*;
import java.io.*;

public class PalindromePermutation {
	
	public static void main(String []args){
		System.out .println("Hello please enter your desired string.");
		Scanner input = new Scanner(System.in);
		String test = input.nextLine();
				
		System.out.println(PalindromeTest("tacocat"));
		

//		if(permuteString("", test)){
//			System.out.println("The inputed string is a permutation of a palindrome.");
//		}
//		else{
//			System.out.println("The inputed string is NOT a permutation of a palindrome.");
//
//		}
		System.out.println("yooooo");
		
	}
	
	static boolean permuteString(String beginningString, String endingString) {
		ArrayList<String> permList = new ArrayList<String>();
	    if (endingString.length() <= 1){
	      permList.add(beginningString + endingString);
	    }
	    else
	      for (int i = 0; i < endingString.length(); i++) {
	        try {
	          String newString = endingString.substring(0, i) + endingString.substring(i + 1);
	          permuteString(beginningString + endingString.charAt(i), newString);
	        } catch (StringIndexOutOfBoundsException exception) {
	          exception.printStackTrace();
	        }
	      }
	    
	    ArrayList<Boolean> palindromes = new ArrayList <Boolean>();
		for(int i =0; i< permList.size(); i++){
			String temp = permList.get(i);
			if(PalindromeTest(temp)){
				palindromes.add(true);
			}
		}
		if(palindromes.contains(true)){
			return true;
		}
		return false;
	    
	  }

	public static boolean PalindromeTest(String word){
		word = word.replaceAll("\\s+", "");
		if(word.charAt(0)== 't'){
			System.out.println("Word " + word);
		}
		int lastIndex = word.length();
		//if word has and odd numbered length
		if(word.length()%2 == 1){
			for(int i = 0; i<((word.length()-1)/2) ; i++ ){
				if(!word.substring(i, i+1).equals(word.substring(lastIndex-1, lastIndex))){
					System.out.println(word.substring(i, i+1) + " and " + word.substring(lastIndex-1, lastIndex) );
					return false;
				}
				lastIndex --;
			}
		}
		else{
			for(int i = 0; i<(word.length()/2) ; i++ ){
				if(!word.substring(i, i+1).equals(word.substring(lastIndex-1, lastIndex))){
					return false;
				}
				lastIndex --;
			}
		}
		return true;
	}

	//static boolean result (String beginningString, String endingString){
//	//	ArrayList<String> permList = permuteString(beginningString,endingString);
//		System.out.println("size = " +permList.size());
//
//		ArrayList<Boolean> palindromes = new ArrayList <Boolean>();
//		for(int i =0; i< permList.size(); i++){
//			if(PalindromeTest(permList.get(i))){
//				palindromes.add(true);
//			}
//		}
//		if(palindromes.contains(true)){
//			return true;
//		}
//		
//		
//		return false;
//	}
}
