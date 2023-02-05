package com.java.demo;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigByType {

	static {
		System.out.println("SpringConfigByType class gets loaded into method area in memory");
	}
	{
		System.out.println("Instance block of SpringConfigByType executes at each object creation");
	}
	
	@Bean(name="Car1",autowire = Autowire.BY_TYPE)
	public Car getCar() {
		return new Car();
	}
	@Bean//(name="battery")
	public Battery getBattery1() {
		return new Battery(101, "Microtex");
	}
	@Bean//(name="battery")
	@Qualifier("bt1")   // as two beans of same type are present hence there arises ambiguity so use @Qualifier 
	public Battery getBattery2() {
		return new Battery(102, "Microampere");
	}
	
	@Bean(name="musicSystem")
	public MusicSystem getMusicSystem2() {
		return new MusicSystem(1002, "Panasonic Classic", "Automotive Sound Based High Quality");
		
	}
	@Bean(name="engine")
	public Engine getEngine() {
		return new Engine(10101, "EnginePart1", "EnginePart2");
	}
	@Bean(name="justForcompr")
	@Qualifier("Elec")
		public  Electornics getElectornics() {
		return new Electornics(10234, "ElectornicItem");
	}
}
