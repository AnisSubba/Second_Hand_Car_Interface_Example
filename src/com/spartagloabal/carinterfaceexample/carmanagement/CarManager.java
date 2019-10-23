package com.spartagloabal.carinterfaceexample.carmanagement;

public class CarManager {

    public Car createCar(String brand, String model, int makeYear, String gearType, String fuelType, int mileAge, int warranty){
//
        Car car = new Car();
        car.setGearType(gearType);

        car.setBrand(brand);
        car.setModel(model);
        car.setMakeYear(makeYear);

        return car;
    }
}
