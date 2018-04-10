package com.minhhuyle.gitflow;

import com.minhhuyle.gitflow.model.Car;
import com.minhhuyle.gitflow.model.IVehicule;
import com.minhhuyle.gitflow.model.Truck;

public class TMain {
    public static void main(String[] args) {

        IVehicule truck = new Truck();
        truck.start();
        truck.run();
        truck.stop();

        IVehicule car = new Car();
        car.start();
        car.run();
        car.stop();



    }
}
