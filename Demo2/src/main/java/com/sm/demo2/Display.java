package com.sm.demo2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Display{

	public static void main(String[] args) {
		Alien alien;
		Bike bike;
		
		Configuration conf= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class).addAnnotatedClass(Bike.class);
		SessionFactory sessionFactory=conf.buildSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction tx =session.beginTransaction();
	 	//Fetching the data from Database
		alien =(Alien)session.get(Alien.class,1);
	   	bike =(Bike)session.get(Bike.class, 290);
	 	
	   	tx.commit();
	   	//Displaying data 
	   	System.out.println("\n"+alien+"\n");
	   	System.out.println(bike);
			
	}

	 

}
