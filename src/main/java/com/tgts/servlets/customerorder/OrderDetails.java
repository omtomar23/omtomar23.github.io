package com.tgts.servlets.customerorder;

import com.self.om.tailerManagement.GarmentType;

public class OrderDetails 
{
	private GarmentType garmentType;
	private double price;

	public OrderDetails(GarmentType garmentType, double price)
	{
		this.garmentType = garmentType;
		this.price = price;
	}
	
	public GarmentType getGarmentType() {
		return garmentType;
	}
	public double getPrice() {
		return price;
	}
}
