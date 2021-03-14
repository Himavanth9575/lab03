package com;

import java.util.Scanner;
public class ReplaceCons {
	public String replaceConsonants(String str) {
		StringBuilder sb = new StringBuilder();
        sb.append(str);
        for(int i=0;i<str.length();i++) {
        	char c = sb.charAt(i);
            if(!(c=='A'||c=='a'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u'||c=='E'||c=='e')) {
            	sb.replace(i,i+1,String.valueOf((char)(c+1)));
            }
        }
        return sb.toString();
	}
    public static void main(String[] ar) {
    	ReplaceCons p = new ReplaceCons();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = s.next();
        s.close();
        System.out.println(p.replaceConsonants(str));
    }
}
