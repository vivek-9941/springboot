package com.vivek.demospringApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//using ioc spring will not create objext of all the classes
//it will create of those which is be declared with @Component
@Component
public class hello {
    @Autowired
    laptop lap;

    public void greet(){
        System.out.println(
                "working on a spring boot project to get into dream company"

        );
        lap.display();

    }
}
