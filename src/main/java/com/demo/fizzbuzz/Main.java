package com.demo.fizzbuzz;

public class Main {

	public static void main(String[] args) {
		stage1();
		//stage2();

	}

	private static void stage1(){
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else{
				System.out.println(i);
			}
		}
	}
	private static void stage2(){
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0 || (i + "").contains("3")&& (i + "").contains("5")) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0 || (i + "").contains("3")) {
				System.out.println("Fizz");
			} else if (i % 5 == 0 || (i + "").contains("5")) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

}
