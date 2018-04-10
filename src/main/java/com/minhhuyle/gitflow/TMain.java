package com.minhhuyle.gitflow;

import com.minhhuyle.gitflow.model.Car;
import com.minhhuyle.gitflow.model.IVehicule;

public class TMain {
    public static void main(String[] args) {

        IVehicule myCar = new Car();
        myCar.run();

    }
}
