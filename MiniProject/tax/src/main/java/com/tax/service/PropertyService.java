package com.tax.service;

import java.util.HashMap;
import java.util.Map;

import com.tax.exception.TaxException;
import com.tax.model.PropertyBaseClass;
 
public class PropertyService {
    private Map<Integer, PropertyBaseClass> properties = new HashMap<>();
 
    public PropertyService() {
        properties.put(101, new PropertyBaseClass(101, 1200, 2500.0, 10, 'y', 0.0));
        properties.put(102, new PropertyBaseClass(102, 800, 1800.0, 5, 'n', 0.0));
        properties.put(103, new PropertyBaseClass(103, 1500, 3000.0, 8, 'y', 0.0));
    }
 
    public void addProperty(PropertyBaseClass property) {
        properties.put(property.getId(), property);
        System.out.println("Property added successfully (ID: " + property.getId() + ")");
    }
 
    public void calculateTax(int id) throws TaxException {
        PropertyBaseClass data = properties.get(id);
        if (data == null) throw new TaxException("Property ID not found!");
 
        double result;
        if (data.getInCity() == 'y') {
            result = (data.getBuildArea() * data.getAge() * data.getBasePrice())
                    + (0.5 * data.getBuildArea());
        } else {
            result = data.getBuildArea() * data.getAge() * data.getBasePrice();
        }
        data.setPropertyTax(result);
        System.out.println("Tax calculated for Property ID " + id + ": " + result);
    }
 
    public void displayAll() {
        if (properties.isEmpty()) {
            System.out.println("No property details found!");
            return;
        }
        System.out.printf("%-10s %-10s %-12s %-8s %-8s %-12s%n",
                "PropID", "Area", "BasePrice", "Age", "City", "Tax");
        System.out.println("---------------------------------------------------------------");
        for (PropertyBaseClass data : properties.values()) {
            System.out.printf("%-10d %-10d %-12.2f %-8d %-8c %-12.2f%n",
                    data.getId(), data.getBuildArea(), data.getBasePrice(),
                    data.getAge(), data.getInCity(), data.getPropertyTax());
        }
    }
 
    public double getTotalTax() {
        return properties.values().stream().mapToDouble(PropertyBaseClass::getPropertyTax).sum();
    }
 
    public int getTotalCount() {
        return properties.size();
    }
}