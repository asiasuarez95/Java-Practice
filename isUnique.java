/**
 * The purpose of this program is to test if a string has unique characters. 
 */

import java.util.*;

public class isUnique {

	public static void main(String[] args) {
		System.out.println("Please enter a string to test if it is filled with all unique numbers.");
		Scanner input = new Scanner(System.in);
		String testInput = input.nextLine();
		if(isUnique(testInput)){
			System.out.println("Your string is unique");
		}
		else{
			System.out.println("Your string is not unique");

		}
		input.close();
	}
	/**
	 * This method takes a string called input and stores each unique letter in an array list
	 * It then references this array list to determine if a string is unique or not. 
	 * @param input
	 * @return
	 */
	static boolean isUnique(String input){
		
		ArrayList <String> uniqueL = new ArrayList<String>();
		for(int i = 0; i < input.length(); i++ ){
			if(uniqueL.contains(input.substring(i, i+1).toLowerCase())){
				return false;
			}
			else{
				uniqueL.add(input.substring(i,i+1));
			}
		}
		
		return true;
	}

}
