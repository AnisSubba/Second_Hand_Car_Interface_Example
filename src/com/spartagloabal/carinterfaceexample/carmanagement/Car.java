package com.spartagloabal.carinterfaceexample.carmanagement;

public class Car implements INewCar {

    private int warranty;
    private String brand;
    private String model;
    private int makeYear;
    private int mileAge = 0;
    private String gearType;
    private String fuelType;

    @Override
    public int setWarranty() {
        return this.warranty;
    }

    @Override
    public void getWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int getMakeYear() {
        return this.makeYear;
    }

    @Override
    public void setMakeYear(int makeYear) {
        this.makeYear = makeYear;
    }

    @Override
    public String getGearType() {
        return this.gearType;
    }

    @Override
    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    @Override
    public String getFuelType() {
        return this.fuelType;
    }

    @Override
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getMileAge(){
        return this.mileAge;
    }

}
