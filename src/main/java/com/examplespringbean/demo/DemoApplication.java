package com.examplespringbean.demo;

import com.examplespringbean.demo.config.MyConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        ClassPathXmlApplicationContext contextXml = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dog dog = (Dog) context.getBean("getDog");
        Cat cat = (Cat) contextXml.getBean("cat");
        System.out.println(dog.getSay());
        System.out.println(cat.getSay());

    }

}
