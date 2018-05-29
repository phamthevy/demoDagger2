package com.example.vypt.demodagger2;

import javax.inject.Inject;

public class Vehicle {
    private Car car;

    @Inject
    public Vehicle(Car car){
        this.car = car;
    }

    public void increaseSpeed(int value){
        car.accelerate(value);
    }

    public void stop(){
        car.brake();
    }

    public int getSpeed(){
        return car.getRpm();
    }
}
