package org.naveenkumar;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class Main {
  public static void main(String[] args) {

    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(AppConfig.class);

    // Spill all the components
    Map<String, Object> allComponents = context.getBeansWithAnnotation(Component.class);
    for (Map<String, Object> c : List.of(allComponents)) {
      System.out.println("Components " + c);
    }

    // Spill all the beans
    Map<String, Object> allBeans = context.getBeansWithAnnotation(Bean.class);
    for (Map<String, Object> b : List.of(allBeans)) {
      System.out.println("Beans " + b);
    }

    Vehicle b = (Vehicle) context.getBean("oldBike");
    b.drive();
    System.out.println(b.getName() + " " + b.getPrice() + " " + b.getDriverName());
    b.brake();

    Vehicle b2 = (Vehicle) context.getBean("oldBike");
    b2.drive();
    System.out.println(b2.getName() + " " + b2.getPrice() + " " + b2.getDriverName());
    b2.brake();

    // Spill all the beans
    Map<String, Object> allBeansAfter = context.getBeansWithAnnotation(Bean.class);
    for (Map<String, Object> b2Bean : List.of(allBeansAfter)) {
      System.out.println("Beans " + b2Bean);
    }

    Vehicle c = (Vehicle) context.getBean("newCar");
    c.drive();
    System.out.println(c.getName() + " " + c.getPrice() + " " + c.getDriverName());
    c.brake();
  }
}
