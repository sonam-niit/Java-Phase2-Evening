package com.simplilearn.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.simplilearn.custom.CustomEventPublisher;

public class App 
{
    public static void main( String[] args )
    {
       
    	ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("main-servlet.xml");
    	
    	context.start();
    	context.stop();
    	
    	CustomEventPublisher cep=(CustomEventPublisher)context.getBean("cep");
    	cep.publish();
    	
    }
}
