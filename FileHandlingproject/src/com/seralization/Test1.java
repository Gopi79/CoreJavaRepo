package com.seralization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test1 {
	public static void main(String[] args)
	{
		Demo object = new Demo(783495, "seri@1234");
		String filename = "file.ser";
		// Serialization
		try
		{
			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			// Method for serialization of object
			out.writeObject(object);
			out.close();
			file.close();
			System.out.println("Object has been serialized");
		}
		catch (IOException ex)
		{
			System.out.println("IOException is caught");
		}
		Demo object1 = null;
		// Deserialization
		try 
		{
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			// Method for deserialization of object
			object1 = (Demo) in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialized ");
			System.out.println("userid = " + object1.userid);
			System.out.println("password = " + object1.password);
		}
		catch (IOException ex)
		{
			System.out.println("IOException is caught");
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("ClassNotFoundException is caught");
		}
	}
}
