import java.io.*;
import java.util.*;


public class challenge2
{
	public static double employeeSalary(int hoursWorked, double ratePerHour, int vacationDays)
	{
		if (hoursWorked < 1)
		{
			return -1;
		}
		if (ratePerHour < 1)
		{
			return -1;
		}
		
		double unpaidTime = ratePerHour * (vacationDays * 8);
		double weeklySalary = hoursWorked * ratePerHour;
		double yearlyGrossSalary = (weeklySalary * 52) - unpaidTime;

		return yearlyGrossSalary;
	}

	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter hour worked per week:");
		int hWorked = input.nextInt();

		System.out.println("Please enter the rate per each hour:");
		double rate = input.nextDouble();

		System.out.println("How many vacation days did you take:");
		int vacDays = input.nextInt();

		double yearGross = employeeSalary(hWorked, rate, vacDays);
		System.out.println("----------------------\n");
		System.out.println("Your Yealy Gross Salary is R"+yearGross+"\n");
	}
}
