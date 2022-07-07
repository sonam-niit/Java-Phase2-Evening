package com.simplilearn.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args )
    {
       
//    	Resource resource= new ClassPathResource("beans.xml");
//    	BeanFactory factory= new XmlBeanFactory(resource);
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
    	
    	HelloWorld h=(HelloWorld) context.getBean("obj");
    	h.print();
    	
    	Student s= (Student) context.getBean("s1");
    	System.out.println("Id: "+s.getId());
    	System.out.println("Name: "+s.getName());
    	
    	Marks m= s.getMarks();
    	System.out.println("Physics: "+m.getPhy());
    	System.out.println("Chemistry: "+m.getChem());
    	System.out.println("Mathematics: "+m.getMaths());
    }
}
