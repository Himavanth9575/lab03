package com;

import java.util.Scanner;

public class ModifyNum {
	static int modifyNumber(int number1) {
		StringBuilder s = new StringBuilder("" + number1);
		int returnAns=0;
		for(int i=0;i<s.length()-1;i++) {
			returnAns *=10;
			returnAns +=Math.abs(s.charAt(i)-s.charAt(i+1));
		}
		return returnAns*10+(number1%10);
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		System.out.println(modifyNumber(n));
		s.close();
	}
}
