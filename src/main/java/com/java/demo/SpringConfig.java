package com.java.demo;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {
	static {
		System.out.println("SpringCongfig class laoded into memory");
	}
	{
	System.out.println("Instance block of SpringConfig");
	}
	@Bean("emp1")
	@Scope("prototype")
	public Employee getEmployee() {
		System.out.println("inside empbean1");
		Employee emp1 = new Employee();
		emp1.setEmpId(101);
		emp1.setEmpName("AAAA");
		emp1.setEmpSalary(19999.54);
		emp1.setEmpRole("Lead");
		return emp1;
		
		
	}
	@Bean(autowire = Autowire.BY_NAME)
	public Car getCar() {
		/* without using autowiring concept.
		Car c1 = new Car();
		c1.setCarId(10);
		c1.setCarName("Maruti Suzuki Ciaz");
		c1.setBattery(getBattery());
		c1.setMusicSystem(getmusicSystem());
		c1.setEngine(getEngine());
		c1.setJustForcompr(getElectronics());
		return c1;*/
		
		return new Car();
		
	}
	@Bean(name="battery")
	public Battery battery1() {
		
		return new Battery(101,"Exide");
	}
	@Bean(name="battery")
	public Battery battery2() {
		return new Battery(102, "Mitronix");
	}
	@Bean(name="musicSystem")
	public MusicSystem musicSystem1() {
		
		return new MusicSystem(1001,"Sony","SOUND BASED");
	}
	@Bean(name="musicSystem")
	public MusicSystem musicSystem() {
		
		return new MusicSystem(10011,"Sony1","SOUND BASED1");
	}
	
	@Bean
	public Engine engine() {
		return new Engine(201, "enginepart1", "enginepart2");
	}
	@Bean
	public Electornics justForcompr() {
		
		return new Electornics(10001,"ELECTRONICS");
	}
}
