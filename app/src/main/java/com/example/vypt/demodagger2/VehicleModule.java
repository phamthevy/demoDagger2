package com.example.vypt.demodagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class VehicleModule {

    @Provides @Singleton
    Car provideCar(){
        return new Car();
    }

    @Provides @Singleton
    Vehicle provideVehicle(){
        return new Vehicle(new Car());
    }

}
