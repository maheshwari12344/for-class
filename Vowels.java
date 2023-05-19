package com.onesoft.day6_for;

public class Vowels {
	public static void main(String[] args) {
		String a="pineapple";
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') {
				System.out.println(a.charAt(i)+" is vowel");
			}
			else {
				System.out.println(a.charAt(i) +" is a consonant");
			}
		}
	}
	}

