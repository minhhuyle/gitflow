package com.minhhuyle.gitflow.model;

public class Car extends Vehicule{
    public void stop() {

        System.out.println("Car stop");
    }

    public void run() {

        System.out.println("Car run");
    }


    public void start() {

        System.out.println("Car Start");
    }

    public void controlWindows(int level) {

        System.out.println("Car windows level : " + level);
    }
}
