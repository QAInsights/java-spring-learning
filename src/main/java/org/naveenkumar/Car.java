package org.naveenkumar;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

  Drivers drivers;

  @Override
  public String getDriverName() {
    return this.drivers.getName();
  }

  public Car(String name, Double price, Drivers drivers) {
    this.drivers = drivers;
    this.name = name;
    this.price = price;
  }

  public Car(Drivers drivers) {
    this.drivers = drivers;
  }

  private String name;
  private Double price;

  public Car(String name, Double price) {
    this.name = name;
    this.price = price;
  }

  public Car(Double price) {
    this.price = price;
  }

  public Car(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return this.name;
  }

  public Car() {}

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  @Override
  public void drive() {
    System.out.println(Car.class.getSimpleName() + " is driving");
  }

  @Override
  public void brake() {
    System.out.println(Car.class.getSimpleName() + " applying brake");
  }
}
