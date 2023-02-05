package com.java.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartApp {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(SpringConfig.class);
	
	Product product1 = (Product) context.getBean("p1");
	System.out.println(product1);
	Product product2 = (Product) context.getBean("p2");
	System.out.println(product2);
	Category category1 = (Category) context.getBean("c1");
	System.out.println(category1);
	Vendor vendor1 = (Vendor) context.getBean("v1");
	System.out.println(vendor1);
	
	System.out.println(product1.hashCode());
	System.out.println(product2.hashCode());
	System.out.println("----------------------------------------------------------------------------------");

	SpringUtil springUtil = (SpringUtil) context.getBean("Util");
	Product product3 = springUtil.getProdref();
	
	System.out.println(product3.toString());
	System.out.println(product3.hashCode());
	// here product1 and product3 have same hashcode as springUtil gets the same product1 from the bean in SpringConfig classs
	//
	
	
	
}
}
