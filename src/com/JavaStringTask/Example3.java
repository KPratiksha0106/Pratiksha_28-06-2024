package com.JavaStringTask;

public class Example3 
{

	public static void main(String[] args) 
	{

		
		String text = "Welcome to Java Programming";
					// gnimmargorP avaJ ot emocleW
		
		for(int i = text.length()-1; i >= 0 ; i--)
		{
			System.out.print(text.charAt(i));
		}
		
		System.out.println();
		
		StringBuffer sb = new StringBuffer("Welcome to Java Programming");
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		StringBuilder sb1 = new StringBuilder("Welcome to Java Programming");
		System.out.println(sb1);
		System.out.println(sb1.reverse());

	}

}
