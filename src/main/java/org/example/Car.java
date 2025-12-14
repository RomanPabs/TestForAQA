package org.example;

public class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void printCarInfo() {
        System.out.println(brand + " " + model + " " + year);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("BMW", "X5", 2021);
        Car car3 = new Car("Mercedes", "LS", 2022);

        car1.printCarInfo();
        car2.printCarInfo();
        car3.printCarInfo();
    }
}



