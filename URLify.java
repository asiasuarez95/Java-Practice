/**
 * The purpose of this program is to replace spaces in a string with "%20".
 */
import java.io.*;
import java.util.*;

public class URLify {
	
	public static void main(String [] args){
		System.out.println("Please enter the string that you desire to be changed.");
		Scanner input = new Scanner(System.in);
		String original = input.nextLine();
		System.out.println("Please enter the length of the new string");
		int len = input.nextInt();
		
		System.out.println("Your new string is \"" + URLify(original,len) +"\".");
		
		
	}
	/**
	 * Specifically, this method takes a string ending with a padding of spaces. It also takes an integer value 
	 * which determines the true length of the original string that you would like to adjust. The output produced replaces
	 * all of the spaces that are within the specified true length with "%20". For example,
	 * URLify("Mr John Smith    ", 13) produces "Mr%20 John%20 Smith". 
	 * @param original
	 * @param input
	 * @return
	 */
	static String URLify(String original, int input){
		int count = 0;
		for(int i = 0; i< input; i++){
			if (original.substring(i, i+1).equals(" ")){
				count ++;
			}
		}
		char[] array = new char [input + (count*3)];
		int oIndex =0;
		for(int i =0; i < array.length; i++){
				if(!original.substring(oIndex, oIndex + 1).equals(" ")){
					array[i] = original.charAt(oIndex);
					oIndex++;
				}
				else{
					array[i] = '%';
					array[i+1] = '2';
					array[i+2] ='0';
					i = i +3;
					oIndex ++;
				}
		}
		
		String finalString = String.valueOf(array);
		
		return finalString;
	}

}
