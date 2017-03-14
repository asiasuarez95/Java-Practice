/**
 * The purpose of this program is to prompt a user for 2 words and determine if the second word is a permutation of the other.
 */
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class isPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter an initial string.");
		Scanner input = new Scanner(System.in);
		String original = input.nextLine();
		System.out.println("Please enter a string to test if it is a permutation of " + original);
		String test = input.nextLine();
		
		if(isPermutation(original, test)){
			System.out.println(test + " is a permutation of " + original);
		}
		else{
			System.out.println(test + " is not a permutation of " + original);
		}
		
		
	}
	/**
	 * This method determines if test is a permutation of original.
	 * @param original
	 * @param test
	 * @return
	 */
	static boolean isPermutation(String original, String test){
		if(original.equalsIgnoreCase(test)){
			return false;
		}
		else{
			boolean array [] = new boolean [original.length()];
			for(int i = 0; i< test.length(); i++){
				//letter is not in original string
				
				if(!original.contains(test.substring(i,  i+1))){
					return false;
				}
				//letter is in original string
				else{
					//find appropriate index
					for(int j = 0; j< original.length(); j++){
						if(original.substring(j, j+1).equals(test.substring(i,i+1))&& !array[j]){
							array[j] = true;
							break;
						}
					}
				}
			}
			if(Arrays.asList(array).contains(false)){
				return false;
			}
		}
		
		return true;  
	}

}
