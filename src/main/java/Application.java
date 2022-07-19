import com.kenzie.app.planet.Planet;
import com.kenzie.app.planet.PlanetDistance;
import com.kenzie.app.planet.PlanetType;

public class Application {
    public static void main(String[] args){

        //Sample code to test out classes and enums
        System.out.println("Total planets:");
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
//        for (com.kenzie.app.planet.PlanetType currentVal : com.kenzie.app.planet.PlanetType.values()) {
//            System.out.println(currentVal);
//        }


    }

}


;