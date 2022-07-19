package com.kenzie.app.planet;

import java.util.HashMap;
import java.util.Map;

public class Planet {
    //Properties
    protected static int numOfPlanets = 8;
    protected static String starName = "Sun";

    protected String name;
    protected int numOfMoons;
    protected PlanetType type;    // gaseous or terrestrial

    //constructor - default
    public Planet() {
        this.name = "";
        this.numOfMoons = 0;
        this.type = PlanetType.TERRESTRIAL;
    }

    public Planet(String name) {
        this.name = name;
    }

    //Methods

    //getter method for static variable
    public static int getNumOfPlanets() {
        return numOfPlanets;
    }

    @Override
    public String toString() {
        return "com.kenzie.app.planet.Planet{" +
                "name='" + name + '\'' +
                ", numOfMoons=" + numOfMoons +
                ", type='" + type + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfMoons() {
        return numOfMoons;
    }

    public void setNumOfMoons(int numOfMoons) {
        this.numOfMoons = numOfMoons;
    }

    public PlanetType getType() {
        return type;
    }

    public void setType(PlanetType type) {
        this.type = type;
    }
}

//define enum