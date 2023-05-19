package com.onesoft.day6_for;

public class Reverse {
public static void main(String[] args) {
	String a="maheswari";
	String reverse="";
	for(int i=a.length()-1;i>=0;i--) {
		//System.out.println();
		reverse=reverse+a.charAt(i);
	}
	System.out.println(a);
	System.out.println(reverse);
	if(a.equalsIgnoreCase(reverse)) {
		System.out.println(a+" is a palindrome");
	}
	else {
		System.out.println(a+" is not a palindrome");
	}
}
}
