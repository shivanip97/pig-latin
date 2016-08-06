import java.util.Scanner;
import java.util.regex.Pattern;

public class PigLatin {

	static Scanner scan = new Scanner(System.in);
	public static boolean isFirstLetterVowel(String string){
		if(string.charAt(0) == 'a' || string.charAt(0) == 'e' || string.charAt(0) == 'i' || string.charAt(0) == 'o' || string.charAt(0) == 'u')
			return true;
		return false;
	}
	
	public static void pigLatinForm(String string){
		if(isFirstLetterVowel(string)){
			string = string + "ay";
			System.out.print(string);
		}
		else{
			while(!isFirstLetterVowel(string)){
				string = string + string.charAt(0);
				string = string.substring(1);
			}
			string = string + "ay";
			System.out.print(string);
		}
	}
	
	public static void main(String []args){
		System.out.println("Enter the word whose pig latin you want to know: ");
		String input = scan.nextLine();
		while(!Pattern.matches("[a-zA-Z]+", input)){
			System.out.println("Invalid input! Please try another input: ");
			input = scan.next();
		}
		pigLatinForm(input);
	}
}
