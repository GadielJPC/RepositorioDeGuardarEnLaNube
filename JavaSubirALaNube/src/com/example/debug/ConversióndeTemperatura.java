package com.example.debug;

public class ConversióndeTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double celsius = 25;
		System.out.println(celsius + " grados Celsius son " + celsiusAFahrenheit(celsius) + " grados Fahrenheit.");
	}

	public static double celsiusAFahrenheit(double c) {
		return ((c * 9) / 5) + 32; // Corrección en los paréntesis
	}

}
