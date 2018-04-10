package com.minhhuyle.gitflow.model;

public class MotorBike extends Vehicule {

    public MotorBike() {

        super(5);
    }

    public void run() {

        System.out.println("MotorBike run speed " + speed);
    }
}
