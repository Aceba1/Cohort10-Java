package com.aceba1.cdclass.oct10c;

public class Main {

  public static void main(String[] args) {
    Car car = new Car("white", "Egg", "uh", 420, 1999);
    System.out.println(car.toggleOn());
    System.out.println(car.toggleOn());
    System.out.println(car.toggleOn());
    System.out.println(car);
  }
}