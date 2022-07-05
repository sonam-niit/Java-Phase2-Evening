package com.ecommerce;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	private static SessionFactory sessionFactory=null;
	
	static
	{
		try {
		StandardServiceRegistry registery=new 
				StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata metadata= new MetadataSources(registery).getMetadataBuilder().build();
		sessionFactory= metadata.getSessionFactoryBuilder().build();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	
}
