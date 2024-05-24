import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Lviv");
        cities.add("Kiev");
        cities.add("Chernigiv");
        cities.add("Lviv");

        boolean isKyivExist = checkCityExists(cities, "Kiev");
        System.out.println(isKyivExist);

        List<String> uniqueCities = removeDuplicates(cities);
        System.out.println(uniqueCities);

        ifLvivExist(cities);


    }

    public static boolean checkCityExists(ArrayList<String> cities, String targetCity) {
        for (String city : cities) {
            if (city.equals(targetCity)) {
                return true;
            }
        }
        return false;
    }

    public static List<String> removeDuplicates(List<String> list) {

        Set<String> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public static String ifLvivExist(ArrayList<String> cities) {
        if (cities.contains("Lviv")) {
            System.out.println("Lviv exist");
        } else if (cities.contains("Kiev")) {
            System.out.println("Kiev exist");
        } else {
            System.out.println("Else");
        }
        return null;
    }
}
