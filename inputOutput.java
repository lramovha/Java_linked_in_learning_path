import java.io.*;
import java.util.*;

public class inputOutput
{
	public static void main(String [] args)
	{
		String name;
		String surname;
		double studentGPA = 4.85;
		int age = 18;

		System.out.println("please enter your name: ");
		
		Scanner input = new Scanner(System.in);
		name = input.nextLine();

		System.out.println("Please enter your Surname: ");
		surname = input.nextLine();

		System.out.println("Enter Student GPA ");
		studentGPA = input.nextDouble();

		System.out.println("Enter student age ");
		age = input.nextInt();


		System.out.println("The students name is "+ name + " " +surname);
		System.out.println("their age is " + age + " and they have a GPA of " + studentGPA);
	}
}

