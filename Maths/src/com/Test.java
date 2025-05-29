package com;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(Math.abs(-10));  //10 - gives absolute value (positive)
		System.out.println(Math.max(100, 10)); //100
		System.out.println(Math.min(10, 29)); //10
		
		System.out.println(Math.round(5.4)); //5 - nearest integer
		System.out.println(Math.ceil(5.1)); //6 - next possible integer
		System.out.println(Math.floor(5.8)); //5 - before integer value
		
		System.out.println(Math.pow(5, 2)); //25 - 
		System.out.println(Math.sqrt(25));  //5
		System.out.println(Math.cbrt(125)); //5
		
		System.out.println(Math.random()); //0.0 - 1.0
		
		
		Random random = new Random();
		System.out.println(random.nextInt(1,100)); //it will give random value between 1 - 99
		
	}

}
