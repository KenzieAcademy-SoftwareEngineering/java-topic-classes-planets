import java.util.HashMap;
import java.util.Map;
import java.lang.Integer;

public class Main {
    public static void main(String[] args){

        System.out.println(Planet.getTotalPlanets());

        Planet saturn = new Planet("Saturn");
        saturn.setType("gaseous");
        String planetName = saturn.getName().toUpperCase();
        int distance = (int) Planet.getDistanceToSunMap().get(planetName);
        saturn.setDistance(distance);
        System.out.println(saturn.getName());
        System.out.println(saturn.getType());
        System.out.println(saturn.getDistance());

    }

}


