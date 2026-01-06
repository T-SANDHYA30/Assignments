package com.tax.view;

import java.util.Scanner;
import com.tax.exception.TaxException;
import com.tax.service.PropertyService;
import com.tax.service.VehicleService;

public class HomePage {
	private static final PropertyService propertyService = new PropertyService();
	private static final VehicleService vehicleService = new VehicleService();

	public static void process() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n--- Home Page ---");
			System.out.println("1. Property Tax");
			System.out.println("2. Vehicle Tax");
			System.out.println("3. Total Summary");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");

			int options = sc.nextInt();
			switch (options) {
			case 1:
				propertyMenu(sc);
				break;
			case 2:
				vehicleMenu(sc);
				break;
			case 3:
				totalSummary();
				break;
			case 4:
				System.out.println("Exited from the application");
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
	private static void propertyMenu(Scanner sc) {
		while (true) {
			System.out.println("\n--- Property Tax Menu ---");
			System.out.println("1. Add Property");
			System.out.println("2. Calculate Property Tax");
			System.out.println("3. Display All Properties");
			System.out.println("4. Back to Home");
			System.out.print("Choose an option: ");
			int choice = sc.nextInt();
			if (choice == 1) 
			{
				System.out.print("Enter Property ID: ");
				int id = sc.nextInt();
				System.out.print("Enter Built-up Area: ");
				int area = sc.nextInt();
				System.out.print("Enter Base Price: ");
				double base = sc.nextDouble();
				System.out.print("Enter Age: ");
				int age = sc.nextInt();
				System.out.print("Is in City (y/n): ");
				char city = sc.next().toLowerCase().charAt(0);
				propertyService.addProperty(new com.tax.model.PropertyBaseClass(id, area, base, age, city, 0.0));
			} 
			else if (choice == 2)
			{
				System.out.print("Enter Property ID to calculate tax: ");
				int id = sc.nextInt();
				try
				{
					propertyService.calculateTax(id);

				} 
				catch (TaxException e)
				{
					System.out.println(e.getMessage());
				}
			} 
			else if (choice == 3)
			{
				propertyService.displayAll();
			} 
			else if (choice == 4) 
			{
				break;
			} 
			else
			{
				System.out.println("Invalid choice!");
			}
		}
	}
	private static void vehicleMenu(Scanner sc) {
		while (true)
		{
			System.out.println("\n--- Vehicle Tax Menu ---");
			System.out.println("1. Add Vehicle");
			System.out.println("2. Calculate Vehicle Tax");
			System.out.println("3. Display All Vehicles");
			System.out.println("4. Back to Home");
			System.out.print("Choose an option: ");

			int choice = sc.nextInt();
			sc.nextLine(); // consume newline
			if (choice == 1)
			{
				System.out.print("Enter Reg No: ");
				int reg = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Brand: ");
				String brand = sc.nextLine();
				System.out.print("Enter Velocity: ");
				int vel = sc.nextInt();
				System.out.print("Enter Seats: ");
				int seats = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Type (Petrol/Diesel/Electric): ");
				String type = sc.nextLine();
				System.out.print("Enter Cost: ");
				double cost = sc.nextDouble();
				vehicleService.addVehicle(new com.tax.model.VehicleBaseClass(reg, brand, vel, seats, type, cost, 0.0));
			}
			else if (choice == 2)
			{
				System.out.print("Enter Reg No to calculate tax: ");
				int reg = sc.nextInt();
				
				try 
				{
					vehicleService.calculateTax(reg);
				} 
				catch (TaxException e) {

					System.out.println(e.getMessage());
				}
			} 
			else if (choice == 3) 
			{
				vehicleService.displayAll();
			} 
			else if (choice == 4) 
			{
				break;
			} 
			else 
			{
				System.out.println("Invalid choice!");
			}
		}
	}
	private static void totalSummary()
	{
		System.out.println("\n--- Total Summary ---");
		System.out.printf("%-20s %-20s%n", "Category", "Tax Collected");
		System.out.println("--------------------------------------------");
		System.out.printf("%-20s %-20.2f%n", "Properties (" + propertyService.getTotalCount() + ")",
				propertyService.getTotalTax());
		System.out.printf("%-20s %-20.2f%n", "Vehicles (" + vehicleService.getTotalCount() + ")",
				vehicleService.getTotalTax());
		System.out.println("--------------------------------------------");
		System.out.printf("%-20s %-20.2f%n", "Grand Total",
				propertyService.getTotalTax() + vehicleService.getTotalTax());
	}
}
