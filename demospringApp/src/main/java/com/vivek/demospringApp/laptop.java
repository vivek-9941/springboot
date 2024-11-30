package com.vivek.demospringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class laptop {

    public void display(){
        System.out.println("use of autowiring");

    }
}
