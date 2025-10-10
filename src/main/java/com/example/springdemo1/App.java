package com.example.springdemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	
    	ApplicationContext app=new ClassPathXmlApplicationContext("applicationcontext.xml");
    	
    	Employee e1=(Employee)app.getBean("employee1");
    	Employee e2=(Employee)app.getBean("employee2");
    	System.out.println(e1);
    	System.out.println(e2);
    }
}
