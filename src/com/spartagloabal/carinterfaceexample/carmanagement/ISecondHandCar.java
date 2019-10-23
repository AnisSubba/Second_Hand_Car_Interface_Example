package com.spartagloabal.carinterfaceexample.carmanagement;

public interface ISecondHandCar extends ICar {
    int getRepairHistory();
    void setRepairHistory( int repairHistory);
    int getNumberPreviousOwner();
    void setNumberPreviousOwner(int numberPreviousOwner);
    int getMileage();
    void setMileage(int mileage);

}
