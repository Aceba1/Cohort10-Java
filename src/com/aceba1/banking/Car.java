package com.aceba1.banking;

public class Car {
  private String color;
  private String model;
  private String vin;
  private int tireCount;
  private int year;
  private boolean isOn;

  public Car(String color, String model, String vin, int tireCount, int year) {
    this.color = color;
    this.model = model;
    this.vin = vin;
    this.tireCount = tireCount;
    this.year = year;
    this.isOn = false;
  }

  public Car(String color, String model, String vin, int year) {
    this.color = color;
    this.model = model;
    this.vin = vin;
    this.year = year;
    this.tireCount = 4;
    this.isOn = false;
  }

  public void drive() {
    if (isOn) {
      System.out.println("Moving!");
      return;
    }
    System.out.println("Turn the car on first");
  }

  public void setOn(boolean on) {
    isOn = on;
  }

  public boolean toggleOn() {
    return isOn = !isOn;
  }

  @Override
  public String toString() {
    return "You are driving a " + color + " " + year + " " + model + ".";
  }
}
