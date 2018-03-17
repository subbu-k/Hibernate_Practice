package com.sm.demo2;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Bike bike1 =new Bike();
        bike1.setModel_no(290);
        bike1.setBrand("KTM");
        bike1.setName("DUKE");
        
        Bike bike2 =new Bike();
        bike2.setModel_no(350);
        bike2.setBrand("RE");
        bike2.setName("Classic");
        
        Name name=new Name();
        name.setFname("Subramanyam");
        name.setMname("Shreenivas");
        name.setLname("k");
        Alien alien =new Alien();
        alien.setId(1);
        alien.setName(name);
        alien.setPoints(55);
            
        bike1.setAlien(alien);
        bike2.setAlien(alien);
        //creating  aList of Bike objects 
        List<Bike> bl=new ArrayList<Bike>(); 
         bl.add(bike2);
         bl.add(bike1);
        //list of bikes contained by one alien(passing bike list to Alien)
         alien.setBike(bl);
        
         
         Configuration confg= new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Bike.class);
         SessionFactory sf=  confg.buildSessionFactory(); 
         Session session =sf.openSession();
         Transaction transection = session.beginTransaction();
         session.save(alien);
         session.save(bike1);
         session.save(bike2);
         transection.commit();
        
    }
}
