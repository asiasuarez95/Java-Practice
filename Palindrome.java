import java.util.*;


public class Palindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		word = word.toLowerCase();
		PalindromeTest(word);
		in.close();
	}
	
	public static void PalindromeTest(String word){
		boolean isPal = true;
		int index =0;
		int lastIndex = word.length();
		for(int i =0; i< word.length(); i++){
			if(!word.substring(index, index+1).equals(word.substring(lastIndex - 1, lastIndex))){
				isPal= false;
			}
			lastIndex--;
			index++;
		}
		if ( isPal == true){
			System.out.println("Word is a Palindrome");
		}
		else{
			System.out.println("Word is NOT a Palindrome");
		}
	}

}
