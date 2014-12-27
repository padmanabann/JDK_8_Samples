package com.mahakavi.jdksample.core;

import com.mahakavi.jdksample.Utils.MathUtils;

public class FactorialExample {
	
	public static void main(String[] args){
		
		System.out.println("simpleFactorial   -----> "+ MathUtils.simpleFactorial(10));
		System.out.println("recurciveFact     -----> "+ MathUtils.recurciveFact(10));
		System.out.println("tailrecurciveFact -----> "+ MathUtils.tailrecurciveFact(10));
	}

}

/*
In this example we are going to talk about a classic programming task,
 as we are going to create a Java program that computes the factorial of a non negative integer. 
 Those of you who know your math, you should already know:

The factorial of a positive integer n, annotated n!, is the product of all positive integers from 1 to n. Also, 0! = 1

Hence n! = 1*2*3*4*5.....*n. And so 4! = 1*2*3*4 = 24. Pretty simple.

http://examples.javacodegeeks.com/core-java/factorial-program-in-java/?utm_content=buffer9d13c&utm_medium=social&utm_source=twitter.com&utm_campaign=buffer

*/