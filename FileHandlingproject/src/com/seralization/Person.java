package com.seralization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable
{
	private static final long serialVersionUID = -100l;
	int id;
	String name;
	public static void main(String[] args) throws Exception 
	{
		Person p = new Person();
		p.id = 100;
		p.name = "Raju";

		System.out.println("====Serialization Started ========");

		FileOutputStream fos = new FileOutputStream("person.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.flush();
		oos.close();
		System.out.println("====Serialization completed========");

		System.out.println("==========De-Serialization Started==========");

		FileInputStream fis = new FileInputStream("person.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		Person p1 = (Person) object;
		System.out.println("Id : " + p1.id);
		System.out.println("Name : " + p1.name);
		ois.close();
		System.out.println("==========De-Serialization Ended==========");
	}
}
