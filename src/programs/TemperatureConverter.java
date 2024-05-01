package programs;

import java.util.Scanner;

/*
Program to convert Temperature from Celcius to Fahrenheit
*/

public class TemperatureConverter {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Temperature in Degree Celcius");
		float temp = in.nextFloat();
		
		float t = (temp * 9/5) + 32;
		
		System.out.println("Temp: "+t+"F");

	}

}
