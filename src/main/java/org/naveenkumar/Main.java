package org.naveenkumar;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {
  public static void main(String[] args) {

    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(AppConfig.class);

    Vehicle b = (Vehicle) context.getBean("oldBike");
    b.drive();
    System.out.println(b.getName() + " " + b.getPrice() + " " + b.getDriverName());
    b.brake();

    Vehicle c = (Vehicle) context.getBean("newCar");
    c.drive();
    System.out.println(c.getName() + " " + c.getPrice() + " " + c.getDriverName());
    c.brake();
  }
}
