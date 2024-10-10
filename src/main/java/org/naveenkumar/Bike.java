package org.naveenkumar;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

  private String name;
  private Double price;
  Drivers drivers;

  public Bike(String name, Double price, Drivers drivers) {
    this.name = name;
    this.price = price;
    this.drivers = drivers;
  }

  public Bike(Drivers drivers) {
    this.drivers = drivers;
  }

  public void setDrivers(Drivers drivers) {
    this.drivers = drivers;
  }

  public Bike() {}

  public Bike(Double price) {
    this.price = price;
  }

  public Double getPrice() {
    return price;
  }

  @Override
  public String getDriverName() {
    return this.drivers.getName();
  }

  public Bike(String name) {
    this.name = name;
  }

  public Bike(String name, Double price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public void drive() {
    System.out.println(Bike.class.getSimpleName() + " is driving");
  }

  @Override
  public void brake() {
    System.out.println(Bike.class.getSimpleName() + " applying brake");
  }

  @Override
  public String getName() {
    return this.name;
  }
}
