import java.io.*;
import java.util.*;


public class mealPrice
{
	public static double mealPrice(double mealPrice, double tipRate, double taxRate)
	{
		double tip = tipRate * mealPrice;
		double tax = taxRate * mealPrice;
		double totalMealPrice = tip + tax + mealPrice;
		
		return totalMealPrice;
	}

	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the meal price:");
		double mealprice = input.nextDouble();

		System.out.println("Please enter the meal rate:");
		double tiprate = input.nextDouble();	
			
		System.out.println("Please enter the tax rate:");
		double taxrate = input.nextDouble();

		double groupTotalMealPrice = mealPrice(mealprice, tiprate, taxrate);
		double individualMealPrice = groupTotalMealPrice / 5;

		System.out.println("The total meal price is "+groupTotalMealPrice);
		System.out.println("The individdual meal price is "+individualMealPrice);

		System.out.println("-----------------------\n");
		System.out.println(mealPrice(100, 0.20, 0.08));
	}
}
