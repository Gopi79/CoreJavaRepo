package com.carental;

public class Car
{
	private String carid;
	private String brand;
	private String model;
	private double basePrice;
	private boolean carIsAvailable;
	public Car(String carid, String brand, String model, double basePrice) {
		this.carid = carid;
		this.brand = brand;
		this.model = model;
		this.basePrice = basePrice;
		this.carIsAvailable = true;
	}
	public String getCarid() {
		return carid;
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public boolean isCarIsAvailable() {
		return carIsAvailable;
	}
	public double totalBill(int rentalDays) {
        return basePrice * rentalDays;
    }
	public void rent()
	{
		carIsAvailable=false;
	}
	public void carReturn()
	{
		carIsAvailable=true;
	}
	
}
