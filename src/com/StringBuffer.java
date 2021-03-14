package com;

import java.util.Scanner;

public class StringBuffer {
	public static void main(String[] ar) {
		Scanner s = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = s.next();
		StringBuilder p=new StringBuilder();
        p.append(str);
        p.reverse();
        System.out.println(str+"|"+p);  
        s.close();
    }
}