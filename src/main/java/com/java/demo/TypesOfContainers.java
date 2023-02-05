package com.java.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class TypesOfContainers {
	public static void main(String[] args) {
		// BeanFactory is an interface
		// XmlBeanFactory is a class. ClassPathResource is a class
		// sp2.xml file which is stored in the classpath of the project (src/main/java)
//BeanFactory factory1 = new XmlBeanFactory(new ClassPathResource("sp2.xml"));

// Lazy loading with BeanFactory as here Car class does not get loaded and so its object is not initialized 	
		//only the BeanFactory gets initialized.The beans defined in our BeanFactory will be loaded only when
		//we explicitly call the getBean() method.
		//BeanFactory is lightweight by comparison and could be handy in memory-constrained systems.		
		
//ApplicationContext context = new ClassPathXmlApplicationContext("sp1.xml");
//System.out.println("completed");
//Here, the Car object is created even though we have not called the getBean() method.

//ApplicationContext is considered a heavy IOC container because its eager-loading strategy 
//loads all the beans at startup.  so eager loading.
//sp2.xml file needs the fully qualified path of drive.
//BeanFactory factory2 = new XmlBeanFactory(new FileSystemResource("C:\\Users\\vvdha\\eclipse-workspace\\spring-start\\src\\main\\java\\sp2.xml"));
//Car c1 = (Car) factory2.getBean("car1");
//System.out.println(c1);
//Car c2 = (Car) context.getBean("car2");
//System.out.println(c2);
//MusicSystem mSystem = (MusicSystem)context.getBean("ms2");
//System.out.println(mSystem);
//ApplicationContext context1 = new AnnotationConfigApplicationContext(SpringConfig.class);
		
//Employee e1 = (Employee) context1.getBean("emp1");
//Employee e2 = (Employee) context1.getBean("emp1");
//Employee e3 = (Employee) context.getBean("emp2");
//Employee e4 = (Employee) context.getBean("emp2");
//System.out.println(e1.hashCode());
//System.out.println(e2.hashCode());
//System.out.println(e3.hashCode());
//System.out.println(e4.hashCode());
		// For XML based
//		ApplicationContext context2 = new ClassPathXmlApplicationContext("sp3.xml");
//		Car c1 = (Car) context2.getBean("car1");
//		System.out.println(c1);
//		Car c2 = (Car)context2.getBean("car2");
//		System.out.println(c2);
//		Car c3 = (Car) context2.getBean("car3");
//		System.out.println(c3);
		// For ANNOTATION BASED autowiring by Name
//		ApplicationContext context1 = new AnnotationConfigApplicationContext(SpringConfig.class);
//		Car c3 = (Car) context1.getBean(Car.class);
//		System.out.println(c3);
		
		ApplicationContext context3 = new AnnotationConfigApplicationContext(SpringConfigByType.class);
		Car c3 = (Car) context3.getBean(Car.class);
		System.out.println(c3);
	}
}
