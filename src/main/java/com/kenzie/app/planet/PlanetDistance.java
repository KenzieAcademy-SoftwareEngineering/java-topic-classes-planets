package com.kenzie.app.planet;

public enum PlanetDistance {

    //in 1000 km
    MERCURY(57900),
    VENUS(108200),
    EARTH(149600),
    MARS(227900),
    JUPITER(778600),
    SATURN(1433500),
    URANUS(2872500),
    NEPTUNE(4495100);

    //Private constructor can only be used inside this Enum
    private PlanetDistance(int distanceToCenter) {
        this.distanceToCenter = distanceToCenter;
    }

    //Property used for lookup
    private int distanceToCenter;

    //Getter method
    public int getDistanceToCenter(){
        return this.distanceToCenter;
    }
}
