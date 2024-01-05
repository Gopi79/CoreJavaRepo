package com.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo 
{
	public static void main(String[] args) throws IOException  
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("D://PersonalJavafolder//Java&Spring//CollectionsProject//src//com//propertiesfile//xyz.properties");
		p.load(fis);
		System.out.println(p);
		
		//get properties from xyz.properties file
		String userproperty = p.getProperty("user");
		//System.out.println(userproperty);
		
		//set or add another properties in xyz.properties file
		p.setProperty("nationality", "India");
		FileOutputStream fos=new FileOutputStream("D://PersonalJavafolder//Java&Spring//CollectionsProject//src//com//propertiesfile//xyz.properties");
		p.store(fos, "nationality will be Added.");
		
		//for one by one Iteration use Enumeration
		Enumeration e=p.propertyNames();
		while(e.hasMoreElements())
		{
			Object nextElement = e.nextElement();
			System.out.println(nextElement);
		}
	}
}
