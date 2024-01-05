package com.carental;

import java.io.IOException;

public interface CarRentalInterface 
{
	public abstract void addCar(Car car);
	
	public abstract void addCustomer(Customer customer);
	
	public abstract void rentCar(Car car,Customer customer,int days);
	
	public abstract void returnCar(Car car);
	
	public abstract void menu()throws IOException;
}
