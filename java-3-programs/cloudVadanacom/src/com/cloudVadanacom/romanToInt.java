package com.cloudVadanacom;

import java.util.Scanner;

public class romanToInt {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Roman numeral: ");
		String roman = scn.nextLine().toUpperCase();
		scn.close();
		
		int result = romanToInteger(roman);
		
		if (result == -1) {
			System.out.println("Invalid Roman input.");
		}else {
			System.out.println("The integer equivalent is: " + result);
		}
	}
public static int romanToInteger(String s) {
	int result =0;
	int preValue =0;
	
	for (int i=s.length()-1;i>=0;i--) {
		char c = s.charAt(i);
		int value =0;
		
		switch (c) {
		case 'I':
			value = 1;
			break;
		case 'V':
			value = 5;
			break;
		case 'X':
			value = 10;
			break;
		case 'L':
			value =50;
			break;
		case 'C':
			value =100;
			break;
		case 'D':
			value =500;
			break;
		case 'M':
			value =1000;
			break;
			default :
				return -1;
		}
		if (value < preValue) {
			result -=value;
		} else {
			result +=value;
		}
		preValue = value;
	}
	return result;
}
}
