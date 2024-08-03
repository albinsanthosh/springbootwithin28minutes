package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//released in JDK 16
record Person (String name, int age, Address address) {};

//Address - firstLine, city
record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Ranga";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		var person = new Person("Ravi", 20, new Address("Main Street", "Utrecht"));
		return person;
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address()); //name, age
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) { //name, age, address2
		return new Person(name, age, address3); //name, age
	}
	
	@Bean(name="address2")
	public Address address() {
		return new Address("Baker Street", "London");
	}
	
	@Bean(name="address3")
	public Address address3() {
		return new Address("Motinagar", "Hyderabad");
	}
}

