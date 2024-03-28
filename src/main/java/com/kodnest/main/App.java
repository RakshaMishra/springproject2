package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Laptop;

public class App {
	public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Application-context.xml");
        Laptop bean=(Laptop) context.getBean("l1");
        System.out.println(bean	);
    }

}
