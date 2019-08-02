/* Page 277 Chapter Programming Exercise 2
   Filename: AscendingAndDescending.java
   Author: Sabrina
   Date: 8/2/19

An application that asks an user to enter three integers displaying their input in ascending and descending order. */


import java.util.Scanner;

public class AscendingAndDescending
{
	public static void main(String[] args) 
	{
		int num1;
		int num2;
		int num3;
		int sortOrder;
		

		Scanner inputDevice = new Scanner(System.in);


		// Input Phase
		System.out.print("Please enter three integers >> ");
		num1 = inputDevice.nextInt();
		num2 = inputDevice.nextInt();
		num3 = inputDevice.nextInt();

		
		if (num2 < num1 || num3 < num1) // Ascending order nested if statement
			{
				if (num2 < num1)
					{
						sortOrder = num1;
						num1 = num2;
						num2 = sortOrder; 
					}
						if (num3 < num1)
						{
							sortOrder = num1;
							num1 = num3;
							num3 = sortOrder;
						}
							if (num3 < num2)
							{
								sortOrder = num2;
								num2 = num3;
								num3 = sortOrder;
						}
							
							// Output Phase
							System.out.println("");
							System.out.println("The ascending order is " + num1 + " " + num2 + " " + num3 + "!");
							
			}
		if (num2 > num1 || num3 > num1) // Descending order nested if statement
			{
				if (num2 > num1)
					{
						sortOrder = num1;
						num1 = num2;
						num2 = sortOrder; 
					}
						if (num3 > num1)
						{
							sortOrder = num1;
							num1 = num3;
							num3 = sortOrder;
						}
							if (num3 > num2)
							{
								sortOrder = num2;
								num2 = num3;
								num3 = sortOrder;
							}
							
							// Output Phase
							System.out.println("");
							System.out.println("The descending order is " + num1 + " " + num2 + " " + num3 + "!");
							
			}		

	}
}
	
