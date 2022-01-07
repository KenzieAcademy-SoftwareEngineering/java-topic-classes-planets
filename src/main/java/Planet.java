import java.util.HashMap;
import java.util.Map;

public class Planet {
    //class properties/variables
    private static int starName = "Sun";
    private static int totalPlanets;
    //private static HashMap distanceToSunMap;
    //distance in 1000 km
    private static Map<String, Integer> distanceToSunMap = new HashMap<>(
            Map.of("MERCURY",57900,
                    "VENUS", 108200,
                    "EARTH", 149600,
                    "MARS",227900,
                    "JUPITER", 778600,
                    "SATURN", 1433500,
                    "URANUS", 2872500,
                    "NEPTUNE", 4495100
            )
    );

    private String name;
    private String type;
    private int distance;

    //constructors
    public Planet(String name) {
        this.name = name;
        this.type = "";
        this.distance = 0;
    }

    //methods

    public static int getTotalPlanets() {
        return totalPlanets;
    }

    public static void setTotalPlanets(int totalPlanets) {
        Planet.totalPlanets = totalPlanets;
    }

    public static HashMap getDistanceToSunMap() {
        return (HashMap) distanceToSunMap;
    }

    public static void setDistanceToSunMap(HashMap distanceToSunMap) {
        Planet.distanceToSunMap = distanceToSunMap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
