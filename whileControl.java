import java.io.*;
import java.util.*;

public class whileControl
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		boolean isOnRepeat = true;

		while(isOnRepeat)
		{
			System.out.println("playing current song");
			System.out.println("Would you like this song off repeat? If so, answer yes");
			String userInput = input.next();

			if (userInput.equals("yes"))
			{
				isOnRepeat = false;
			}
		}
		System.out.println("playing next song");
	}
}
