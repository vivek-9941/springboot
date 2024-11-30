package com.vivek.demospringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemospringAppApplication {

	public static void main(String[] args) {
//all the objects are created in jvm

	ApplicationContext context = SpringApplication.run(DemospringAppApplication.class, args);
	//inversion of control
	//SpringApplication.run(DemospringAppApplicaition.class, args) creates the object of ioc
		//direct injection is the implementation of ioc
	//springboot creates the objects of hello on its own and stores in ioc
		//to access this ioc need to create the objext of context

		//all this is done because of the layers of i.e classes in between
	hello obj=  context.getBean(hello.class);
		//specify using getbean which class container is used

	obj.greet();
	}
}
