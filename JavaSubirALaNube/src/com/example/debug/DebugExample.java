package com.example.debug;

public class DebugExample {
	public static void main(String[] args) {
		int result = add(5, 3);
		System.out.println("Resultado: " + result);
	}

	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
}