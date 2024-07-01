package com.JavaStringTask;

public class Example1 {

	public static void main(String[] args) {

		String text = "Welcome to Java Programming";
					//Welcom tJavPrgin

		for(int i = 0; i < text.length(); i++)
		{
			boolean status = true;

			for(int j = 0; j < i; j++)
			{
				
				if(text.charAt(i) == text.charAt(j))
				{
					status = false;
					break;
				}
			}
			if(status)
			{
				System.out.print(text.charAt(i));
			}
		}



	}

}
