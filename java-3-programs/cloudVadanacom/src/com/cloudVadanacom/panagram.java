package com.cloudVadanacom;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class panagram {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter a sentence");
	String  s = scn.nextLine().toLowerCase();
	scn.close();
	
	boolean isPanagram  = checkIfPanagram(s);
	
	if (isPanagram) {
		System.out.println("The input is a panagram.");
	} else {
		System.out.println("The input is not a panagram");
	}
	}
 public static boolean checkIfPanagram (String Sentence) {
Set<Character> letters = new HashSet<Character>();
 for (char c:Sentence.toCharArray()) {
	if (Character.isLetter(c)) {
		letters.add(c);
	}
 }
 return letters.size()==26;
	}
 }
