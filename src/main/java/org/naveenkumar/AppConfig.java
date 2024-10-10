package org.naveenkumar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

  @Autowired Drivers drivers;

  @Bean
  public Drivers drivers() {
    return new Drivers();
  }

  @Scope("prototype")
  @Bean("oldBike")
  public Bike oldBike() {
    return new Bike("Splendor", 250000D, new Drivers("NaveenKumar", true));
  }

  @Bean("newBike")
  public Bike newBike() {
    return new Bike("Yamaha", 450000D);
  }

  @Bean("oldCar")
  public Car oldCar() {
    return new Car("Sonata", 10000D);
  }

  @Bean("newCar")
  public Car newCar() {
    return new Car("Subaru", 40000D, new Drivers("Preethi", true));
  }
}
