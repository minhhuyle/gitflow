package com.minhhuyle.gitflow;

import com.minhhuyle.gitflow.model.Car;
import com.minhhuyle.gitflow.model.IVehicule;
import com.minhhuyle.gitflow.model.MotorBike;
import com.minhhuyle.gitflow.model.Vehicule;

import java.util.Arrays;
import java.util.List;

public class TMain {
    public static void main(String[] args) {

        List<Vehicule> vehicules = Arrays.asList(new MotorBike(), new Car());

        vehicules.forEach(IVehicule::run);
    }
}
