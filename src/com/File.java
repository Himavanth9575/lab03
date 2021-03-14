package com;

import java.util.Scanner;
import java.util.regex.*;
public class File {
	static void wordCounter(String inputString) {
		int count=0;
		Matcher m = Pattern.compile("\\w+").matcher(inputString);
		while(m.find())count++;
		System.out.println("No of Words:"+count);
		m= Pattern.compile("\n").matcher(inputString);
		count=1;
		while(m.find())count++;
		System.out.println("No of Lines:"+count);
		m= Pattern.compile("[a-zA-Z]").matcher(inputString);
		count=0;
		while(m.find())count++;
		System.out.println("No of Characters:"+count);
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter text:");
		String txt=s.nextLine();
		wordCounter(txt);
		s.close();
	}
}
