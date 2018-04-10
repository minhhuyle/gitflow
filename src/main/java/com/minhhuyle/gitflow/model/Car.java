package com.minhhuyle.gitflow.model;

public class Car extends Vehicule{

    public Car() {

        super(130);
    }

    public void run() {

        System.out.println("Car run speed " + speed);
    }

    public void stop() {

        System.out.println("Car stop");
    }

    public void start() {

        System.out.println("Car Start");
    }
}
