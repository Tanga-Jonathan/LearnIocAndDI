package com.kamajo.simpleIoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    public void code(){
        System.out.println("this boy is very Alien");
    };
}
