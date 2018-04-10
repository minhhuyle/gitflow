package com.minhhuyle.gitflow.model;

public class Truck extends Vehicule {
    public void stop() {

        System.out.println("Truck stop");
    }

    public void run() {

        System.out.println("Truck run");
    }

    public void start() {

        System.out.println("Truck start");
    }

    public void controlWindows(int level) {

        System.out.println("Truck windows level : " + level);
    }
}
