import java.util.HashMap;
import java.util.Map;
import java.lang.Integer;

public class Application {
    public static void main(String[] args){
        System.out.println("Total planets:");
        System.out.println(Planet.numOfPlanets);
        System.out.println(Planet.getNumOfPlanets());

        Planet firstPlanet = new Planet("Saturn");
        firstPlanet.setNumOfMoons(82);
        firstPlanet.setType(PlanetType.GASEOUS);

        System.out.println(firstPlanet);
        String lookupName = firstPlanet.getName().toUpperCase();
        int distanceSaturnToSun = PlanetDistance.valueOf(lookupName).getDistanceToCenter();
        System.out.println("Distance to sun:" + distanceSaturnToSun);

        //EnumUtils library  -- has extra functions for Enums

        //loop through an enum
//        for (PlanetType currentVal : PlanetType.values()) {
//            System.out.println(currentVal);
//        }


    }

}


;