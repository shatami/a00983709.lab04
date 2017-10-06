/*
 * Paul Mills	
 * A00123456
 * InputValidator.java
*/
package a00983709.lab04.tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The InputValidator class provides utility method to valid 
 * user input by comparing input String to a Regular Expression.
 */
public class InputValidator {
	
	public InputValidator() { }
	
	public static boolean isValidInput(String input, String pattern) {
		Pattern patt = Pattern.compile(pattern);
		Matcher match = patt.matcher(input);
		
		return match.matches();
	}
}