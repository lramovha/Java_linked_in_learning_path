import java.io.*;
import java.util.*;

public class challenge
{
	public static void main(String [] args)
	{
		String question = "What is the biggest planet in our solar system? ";
		String choiceOne = "jupiter";
		String choiceTwo = "saturn";
		String choiceThree = "uranus";
		boolean notAnswer = true;

		Scanner input = new Scanner(System.in);

		while(notAnswer)
		{
			System.out.println(question);
			System.out.println("Choose from the following choices: " +choiceOne+", "+choiceTwo+" or "+choiceThree);
			String userAnswer = input.next();
			if (userAnswer.equals(choiceOne))
			{
				notAnswer = false;
			}
			else
			{
				System.out.println("Wront answer, the biggest planet is not "+userAnswer+" please try again!");
				System.out.println("----+++-----+++-------------+++---");
			}
		}
		System.out.println("Your answer is correct!! the biggest planet is " +choiceOne+" :)");
	}
}
