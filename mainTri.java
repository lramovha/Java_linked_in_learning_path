import java.io.*;
import java.util.*;

public class mainTri
{
	public static void main(String [] args)
	{
		Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
		Triangle triangleB = new Triangle(3, 2.598, 3, 3, 30);

		System.out.println("The area for triange A = "+triangleA.findArea());
		System.out.println("The area for triange B = "+triangleB.findArea());
		System.out.println("The base for triange A = "+triangleA.base);
		System.out.println("The base for triange B = "+triangleB.base);

		System.out.println("the static variable from triangle A = "+triangleA.numOfSides);
		System.out.println("the static variable from triangle B = "+triangleB.numOfSides);
	}
}
