package com.JavaTypecasting;

public class Example1 
{

	public static void main(String[] args) 
	{

		int a = 10, b = 40;
		float z = a*b;//up casting/implicit type casting

		System.out.println(z);
		
		System.out.println("-------------------------");
		
		float x = 10.56f, y = 40.78f;
		int k = (int)(x*y);//down casting/explicit type casting

		System.out.println(x*y);
		System.out.println(k);
		;

	}



}
