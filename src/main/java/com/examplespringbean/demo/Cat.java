package com.examplespringbean.demo;


import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String say;


    public void setSay(String say) {
        this.say = say;
    }

    public String getSay() {
        return say;
    }

}
