package com.aceba1.cdclass.oct10;

public class Main {

  public static void main(String[] args) {
    // write your code here

    Car car1 = new Car("Motorola", "green", 12);
    Truck car2 = new Truck("Toshiba", "gray", 100);
    Bus car3 = new Bus("Lenovo", "brown", 2000, 420);

    car2.loadCargo(car1);

    for (int i = 0; i < 12; i++)
      car3.addPassenger();

    System.out.println();
    System.out.println(car1);
    System.out.println(car2);
    System.out.println(car3);
    System.out.println();
  }
}

class Car {
  protected float velocity;
  protected float accel;

  protected String name;
  protected String color;
  protected float weight;

  public Car(String name, String color, float weight) {
    this.name = name;
    this.color = color;
    this.weight = weight;
    accel = 5;
  }

  public float addVelocity(float rate) {
    return velocity += rate;
  }

  public float getVelocity() {
    return velocity;
  }

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public void setAccel(float value) {
    accel = value;
  }

  public float getAccel() {
    return accel;
  }

  public float getWeight() {
    return weight;
  }

  @Override
  public String toString() {
    return "Car{" +
      "velocity=" + velocity +
      ", accel=" + accel +
      ", name='" + name + '\'' +
      ", color='" + color + '\'' +
      ", weight=" + weight +
      '}';
  }
}

class Truck extends Car {
  protected Object cargo;

  public Truck(String name, String color, float weight) {
    super(name, color, weight);
  }

  public boolean loadCargo(Object cargo) {
    if (this.cargo != null)
      return false;
    this.cargo = cargo;
    return true;
  }

  public Object getCargo() {
    return cargo;
  }

  public Object unloadCargo() {
    Object unload = cargo;
    cargo = null;
    return unload;
  }

  @Override
  public float getWeight() {
    return super.getWeight() + (cargo != null ? 10 : 0);
  }

  @Override
  public String toString() {
    return "Truck{" +
      "velocity=" + velocity +
      ", accel=" + accel +
      ", name='" + name + '\'' +
      ", color='" + color + '\'' +
      ", weight=" + weight +
      ", cargo=" + cargo +
      "} ";
  }
}

class Bus extends Car {
  protected int maxPassengers;
  protected int passengerCount;

  public Bus(String name, String color, float weight, int maxPassengers) {
    super(name, color, weight);
    this.maxPassengers = maxPassengers;
  }

  public boolean addPassenger() {
    if (maxPassengers <= passengerCount)
      return false;
    passengerCount++;
    return true;
  }

  public boolean removePassenger() {
    if (0 >= passengerCount)
      return false;
    passengerCount--;
    return true;
  }

  public int getMaxPassengers() {
    return maxPassengers;
  }

  @Override
  public float getWeight() {
    return super.getWeight() + passengerCount;
  }

  public int getPassengerCount() {
    return passengerCount;
  }

  @Override
  public String toString() {
    return "Bus{" +
      "velocity=" + velocity +
      ", accel=" + accel +
      ", name='" + name + '\'' +
      ", color='" + color + '\'' +
      ", weight=" + weight +
      ", maxPassengers=" + maxPassengers +
      ", passengerCount=" + passengerCount +
      "} ";
  }
}