package com.java.demo;

import java.security.AllPermission;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.HierarchicalBeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.EnvironmentCapable;
import org.springframework.core.io.support.ResourcePatternResolver;

public class StartApp {
  public static void main(String[] args) {
	  //Employee object which we have created.
	  Employee e1 = new Employee(101,"XXXX",28453.45,"SSE");
	  // e1 is a object but no a bean.
	  System.out.println(e1);
	  // if an object is created and managed by Spring then it is called as bean
	  ApplicationContext context = new ClassPathXmlApplicationContext("sp2.xml");
	 /* ApplicationContext interface extends EnvironmentCapable, ListableBeanFactory, HierarchicalBeanFactory,
		MessageSource, ApplicationEventPublisher, ResourcePatternResolver
		HierarchicalBeanFactory interface extends BeanFactory
		getBean is a public abstract method of BeanFactory interface.
	   // <T> T getBean(Class<T> requiredType, Object... args) throws BeansException;
	  */
	   // Car has a battery
	  //Car has a MusicSystem
	  // Car has a Engine 
	   // all these are associations (engine , battery, Music System ) or dependencies for class Car 
	  // which are to be injected when required.
	   Car c1 = (Car)context.getBean("car1");
	   System.out.println(c1);
	   System.out.println("--------------------------------------------------------------------------------------------");
	   Car c2 = (Car)context.getBean("car2");
	   System.out.println(c2);
	   MusicSystem mSystem = c1.getMusicSystem();  // we can get an object of MusicSystem class thru Cars object c1.
	   System.out.println(mSystem);
	   MusicSystem mSystem2 = (MusicSystem)context.getBean("ms2"); // we can get MusicSystem class object thru the class itself.
	   System.out.println(mSystem2);
	 
	  System.exit(0);
	  Employee e2 = (Employee)context.getBean("emp1"); 
	  // e2 is a object and a bean.
	  System.out.println(e2);
	  Employee e3 = (Employee) context.getBean("emp2");
	  //e3 is an object and a bean.
	  System.out.println(e3);
	  
	  Employee e4 = (Employee)context.getBean("emp3");
	  //e4 is an object and a bean called by constructor-arg type of dependency Injection.
	  System.out.println(e4);
  }
}
