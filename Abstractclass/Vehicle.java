package Abstractclass;

public abstract class Vehicle {
  // buat variabel nama, tahun, dan rpm
  String name;
  int year;
  double rpm;

  // buat sebuah method abstrak yang nantinya akan di override oleh class Car
  public Vehicle(String name, int year, double rpm) {
    this.name = name;
    this.year = year;
    this.rpm = rpm;
  }

  public abstract void printDetails();
}
