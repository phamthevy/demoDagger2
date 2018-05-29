package com.example.vypt.demodagger2;

public class Car {
    private int rpm;

    public Car(){
        this.rpm = 1000;
    }

    public int getRpm(){
        return rpm;
    }

    public void accelerate(int value){
        rpm = rpm + value;
    }

    public void brake(){
        rpm = 0;
    }
}
