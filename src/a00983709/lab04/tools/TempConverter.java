package a00983709.lab04.tools;
/*
 * This is a class to handle conversion process
 */
public class TempConverter {
	
	private static double output;
	
	//This it to convert Fahrenheit to Celsius
	public static double fahrenheitToCelsius(double input) {
		output = 5.0 / 9.0 * (input - 32);
		return output;
	}
	
	//This is to convert Celsius to Fahrenheit
	public static double celsiusToFahrenheit(double input) {
		output = 9.0 / 5.0 * input + 32;
		return output;
	}
	
}
