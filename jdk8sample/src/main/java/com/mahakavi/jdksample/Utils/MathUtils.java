package com.mahakavi.jdksample.Utils;

public class MathUtils {
	
	public static int simpleFactorial(int n){
		int result = 1;
		for(int i = 1; i <= n; i++){
			result = i*result;
		}
		return result;
	}
	
	public static int recurciveFact(int n){
		if(n == 0){
			return 1;
		}else{
			return n*recurciveFact(n-1);
		}
	}
	
	public static int tailrecurciveFact(int n){
		return factorial(n,1);
	}
	
	private static int factorial(int n,int accumulator){
		if(n==0)
			return accumulator;
		else{
			return factorial(n-1,n*accumulator);
		}
	}
	
	/*
	private static int factorialGoto(int n,int accumulator){
		loop:
		if(n==0)
			return accumulator;
		else{
			accumulator*=n;
			n-=1;
			
			goto loop;
		}
	}
	*/
	
	private static int factorialWhile(int n,int accum){
		while (n != 0) {
			accum *= n;
			n -= 1;
	    }
		return accum;
	}
}
