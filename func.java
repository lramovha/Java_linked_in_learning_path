import java.io.*;
import java.util.*;

public class func
{
	public static void developerTeaTime()
	{
		System.out.println("Waiting for developer tea time...");
		System.out.println("type a random word and press enter to start developer tea time.");
		Scanner input = new Scanner(System.in);
		input.next();
		System.out.println("It's developer Tea time!");
	}

	public static void main(String [] args)
	{
		System.out.println("Welcome to your new job");

		developerTeaTime();

		System.out.println("Write code");
		System.out.println("Review code");

		developerTeaTime();

		System.out.println("Get promoted");
	}
}
