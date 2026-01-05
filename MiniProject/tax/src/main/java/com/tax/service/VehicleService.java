package com.tax.service;

import java.util.HashMap;

import java.util.Map;

import com.tax.exception.TaxException;
import com.tax.model.VehicleBaseClass;

public class VehicleService {

	private Map<Integer, VehicleBaseClass> vehicles = new HashMap<>();

	public VehicleService() {

		vehicles.put(201, new VehicleBaseClass(201, "Maruti Suzuki", 120, 5, "Petrol", 600000.0, 0.0));

		vehicles.put(202, new VehicleBaseClass(202, "Hyundai Creta", 150, 7, "Diesel", 1200000.0, 0.0));

		vehicles.put(203, new VehicleBaseClass(203, "Tata Nexon EV", 160, 5, "Electric", 1500000.0, 0.0));

	}

	public void addVehicle(VehicleBaseClass vehicle) {

		vehicles.put(vehicle.getRegNo(), vehicle);

		System.out.println("Vehicle added successfully (RegNo: " + vehicle.getRegNo() + ")");

	}

	public void calculateTax(int regNo) throws TaxException {

		VehicleBaseClass d = vehicles.get(regNo);

		if (d == null)
			throw new TaxException("Vehicle not found!");

		double result = 0.0;

		if (d.getVehicleType().equalsIgnoreCase("Petrol")) {

			result = d.getVelocity() + d.getSeats() + (0.10 * d.getCost());

		} else if (d.getVehicleType().equalsIgnoreCase("Diesel")) {

			result = d.getVelocity() + d.getSeats() + (0.11 * d.getCost());

		} else if (d.getVehicleType().equalsIgnoreCase("Electric")) {

			result = d.getVelocity() + d.getSeats() + (0.05 * d.getCost());

		}

		d.setTax(result);

		System.out.println("Tax calculated for Vehicle RegNo " + regNo + ": " + result);

	}

	public void displayAll() {

		if (vehicles.isEmpty()) {

			System.out.println("No vehicle details found!");

			return;

		}
		
		System.out.println("----------------------------------------------------------------------------------");

		System.out.printf("%-10s %-20s %-10s %-8s %-12s %-12s %-12s%n",

				"RegNo", "Brand", "Velocity", "Seats", "Type", "Cost", "Tax");

		System.out.println("----------------------------------------------------------------------------------1");

		for (VehicleBaseClass d : vehicles.values()) {

			System.out.printf("%-10d %-20s %-10d %-8d %-12s %-12.2f %-12.2f%n",

					d.getRegNo(), d.getBrand(), d.getVelocity(), d.getSeats(),

					d.getVehicleType(), d.getCost(), d.getTax());

		}

	}

	public double getTotalTax() {

		return vehicles.values().stream().mapToDouble(VehicleBaseClass::getTax).sum();

	}

	public int getTotalCount() {

		return vehicles.size();

	}

}
