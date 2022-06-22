package com.simplilearn.manytomany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
    	   StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();    
    	    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();    
    	    SessionFactory factory=meta.getSessionFactoryBuilder().build();    
    	    Session session=factory.openSession();    
    	    Transaction t=session.beginTransaction();      
    	          
    	    Answer an1=new Answer();  
    	    an1.setAnswername("Java is a programming language");  
    	    an1.setPostedBy("Sonam Soni");  
    	      
    	    Answer an2=new Answer();  
    	    an2.setAnswername("Java is a platform");  
    	    an2.setPostedBy("Neeta");  
    	     
    	    Question q1=new Question();  
    	    q1.setQname("What is Java?");  
    	    ArrayList<Answer> l1=new ArrayList<Answer>();  
    	    l1.add(an1);  
    	    l1.add(an2);  
    	    q1.setAnswers(l1);  
    	      
    	      
    	      Answer ans3=new Answer();    
    	        ans3.setAnswername("Servlet is an Interface");    
    	        ans3.setPostedBy("Vijay Kumar");    
    	            
    	        Answer ans4=new Answer();    
    	        ans4.setAnswername("Servlet is an API");    
    	        ans4.setPostedBy("Piyush");    
    	      
    	    Question q2=new Question();  
    	    q2.setQname("What is Servlet?");  
    	    ArrayList<Answer> l2=new ArrayList<Answer>();  
    	    l2.add(ans3);  
    	    l2.add(ans4);  
    	    q2.setAnswers(l2);  
    	      
    	    session.persist(q1);    
    	    session.persist(q2);    
    	        
    	    t.commit();    
    	    session.close();    
    	    System.out.println("success");    
    	      
    	       
    	}    
    	}

