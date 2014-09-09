package com.expedia.lodging.connectivity.locale;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LocaleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context 
		= new ClassPathXmlApplicationContext("META-INF/app.xml");

	String name = context.getMessage("customer.name", 
			new Object[] { 0,"http://www.expedia.com" }, Locale.US);

	System.out.println("Customer name (English) : " + name);


	}

}
