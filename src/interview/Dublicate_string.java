package interview;

public class Dublicate_string {

	//public static void main(String[] args) {
		//public class FirstRepeatingCharacter {

		    public static void main(String[] args) {
		        String word = "bharath";
		        boolean repeat = false;
		        char repeatingChar = '\0';

		        // Loop through the string to find the first repeating character
		        for (int i = 0; i < word.length(); i++) {
		            char ch = word.charAt(i);
		            for (int j = i + 1; j < word.length(); j++) {
		                if (ch == word.charAt(j)) {
		                    repeatingChar = ch;
		                    repeat = true;
		                    break;
		                }
		            }
		            if (repeat) {
		                break;
		            }
		        }

		        if (repeat) {
		            System.out.println("First repeating character: " + repeatingChar);
		        } else {
		            System.out.println("No repeating characters found.");
		        }
		    }
		}
