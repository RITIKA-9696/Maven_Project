package com.ts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration()
    			               .configure("hibernate.cfg.xml")
    			               .addAnnotatedClass(Student.class)
    	                       .addAnnotatedClass(Employee.class);
    	
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	
    	session.beginTransaction();
    	//-----------
    	   Student std1 = new Student();
    	   //std1.setRollno(1);
    	   std1.setName("Amit");
    	   std1.setAddress("Hyderabad");
    	   
    	   //session.save(std1);
    	   session.persist(std1);
    	   
    	   Student std2 = new Student();
    	   std2.setName("Pappu");
    	   std2.setAddress("Hyderabad");
    	   
    	   session.persist(std2);
    	   //Student std2 = new Student(2,"Ramu","Delhi");
    	   //session.save(std2);
    	  // session.persist(std2);
    	   
    	//    Student dbstd = session.get(Student.class, 5);
    	  // System.out.println("Name:- " + dbstd.getName());
    	//-----------
    	
    	session.getTransaction().commit();
    	session.close();
     }
}
