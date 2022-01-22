import java.io.*;
import java.util.*;

public class dataTypes
{
	public static void main(String [] args)
	{
		int studentAge = 22;
		double studentGPA = 3.58;
		boolean attendance = true;
		String firstName = "Amen";
		String lastName = "Ramovha";
		char firstInitial = firstName.charAt(0);
		char lastInitial = lastName.charAt(0);

		System.out.println(studentAge);
        	System.out.println(studentGPA);
        	System.out.println(firstInitial);
        	System.out.println(lastInitial);
        	System.out.println(attendance);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println("student with name "+firstName+" and last name "+lastName+" have a GPA of "+studentGPA+" and an age of "+studentAge);
	}
}
