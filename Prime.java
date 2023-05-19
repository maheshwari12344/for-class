package com.onesoft.day6_for;

public class Prime {
	public static void main(String[] args) {
		int num=11;
		int prime=0;
		//boolean isPrime=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				prime++;
				//isPrime=false;
			}
			
		}
		//if(isPrime==true){
			if(prime==0) {
				System.out.println("prime number");
			}
			else {
				System.out.println("not prime number");
			}
		}
	}


