package com.java.demo2;

import java.security.KeyStore.LoadStoreParameter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  // creates a bean of this class which hold the configauration part 
@ComponentScan(basePackages = {"com.java.demo2"}) // scans for the package com.java.demo2
// if com.java.*  all the classes after com.java menas demo,demo2,spring.sprin_start in this project file.
public class SpringConfig {
	
	static {
		System.out.println("loads class SpringConfig");
	}
		@Bean("p1")
		public Product productBean1() {
			return new Product(101,"MTR Dosa Mix",289.45);
					
			
		}
		@Bean("p2")
		public Product productBean2() {
			return new Product(102,"MTR Masala Idli Mix",209.45,new Category(),new Vendor());
					
			
		}
		@Bean("c1")
		public Category categoryBean1() {
			return new Category(201,"SouthSpecial");
		}
		
		@Bean("v1")
		public Vendor vendorBean1() {
			return new Vendor(301, "Flipkart");
		}
		@Bean("v2")
		public Vendor vendorBean2() {
			return new Vendor(302, "Amazon");
		}
	
}
