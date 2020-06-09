package org.springtestproject;


import Objects.*;
import interfaces.IDrive;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTestProject {

    SpringTestProject(){
       new FactoryObjects(new CarChevrolet(), new PlaneAntonov());
        System.out.println();
       new FactoryObjects(new CarAudi(), new PlaneF45());
        System.out.println();
       new FactoryObjects(new CarAudi(), new PlaneAntonov());
        System.out.println();
       new FactoryObjects(new CarChevrolet(), new PlaneF45());

    }
    public static void main(String[] args) {
        //new SpringTestProject();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //Object obj = context.getBean("factoryObjects");

        FactoryObjects factoryObjects = (FactoryObjects) context.getBean("factoryObjects");
        System.out.println(factoryObjects.showCarName());
        System.out.println(factoryObjects.showPlaneName());
    }
}
