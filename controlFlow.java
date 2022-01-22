import java.io.*;
import java.util.*;


public class controlFlow
{
	public static void main(String [] args)
	{
		System.out.println("Pick a number between 1 and 10");
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();

		if (num < 5)
		{
			System.out.println("Enjoy good luck a friend gives you :) ");
		}
		else
		{
			System.out.println("Your Shoe selection will make you very happy today :) ");
		}
	}
}
