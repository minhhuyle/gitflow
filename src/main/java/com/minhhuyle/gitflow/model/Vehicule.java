package com.minhhuyle.gitflow.model;

public abstract class Vehicule implements IVehicule {
    int x;
    int y;
    int speed;

    public Vehicule(int speed) {

        this.speed = speed;
    }
}
