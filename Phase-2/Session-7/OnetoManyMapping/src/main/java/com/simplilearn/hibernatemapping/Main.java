package com.simplilearn.hibernatemapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {

	public static void main(String[] args) {
		
		StandardServiceRegistry registery=new 
				StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata metadata= new MetadataSources(registery).getMetadataBuilder().build();
		SessionFactory factory= metadata.getSessionFactoryBuilder().build();
		
		Session session= factory.openSession();
		Transaction tx= session.beginTransaction();
		
		List<Book> books= new ArrayList<Book>();
		books.add(new Book("Introduction to JAVA"));
		books.add(new Book("Introduction to Servlets"));
		
		Author a= new Author("sonam soni", books);
		session.save(a);
		tx.commit();
		
		System.out.println("Data Inserted Successfully");
	}
}
