package com.seralization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test implements Serializable
{
	private static final long serialVersionUID = -100l;

	int id;
	String name;
	String email;
	transient String pwd;

	public static void main(String[] args) throws Exception
	{
		Test t = new Test();
		t.id = 100;
		t.name = "Raju";
		t.email = "raju@gmail.com";
		t.pwd = "raj@123";

		System.out.println("====Serialization Started ========");

		FileOutputStream fos = new FileOutputStream("person.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t);
		oos.flush();
		oos.close();
		System.out.println("====Serialization completed========");

		System.out.println("==========De-Serialization Started==========");

		FileInputStream fis = new FileInputStream("person.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		Test t1 = (Test) object;
		System.out.println("Id : " + t1.id);
		System.out.println("Name : " + t1.name);
		System.out.println("Email : " + t1.email);
		System.out.println("Pwd : " + t1.pwd);
		ois.close();
		System.out.println("==========De-Serialization Ended==========");
	}
}
