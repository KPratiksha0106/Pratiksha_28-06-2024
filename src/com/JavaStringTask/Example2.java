package com.JavaStringTask;

public class Example2 
{

	public static void main(String[] args) 
	{

		String text = "Welcome to Java Programming";

		String tokens[] = text.split("\\s");

		for(String token: tokens)
		{
			System.out.println(token);
		};

	}

}
