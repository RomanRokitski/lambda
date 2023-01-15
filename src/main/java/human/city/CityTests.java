package human.city;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CityTests {
    public static void main(String[] args) {


        City kiev = new City("Kiev", 4000000);
        City vinnytsia = new City("Vinnytsia", 450000);
        City lviv = new City("Lviv", 1000000);

        Map<String, Integer> cityPopulation = Stream.of(kiev, vinnytsia, lviv)
                .collect(Collectors.toMap(City::getName, City::getPopulation));

        Map<String, Integer> cityPopulationV2 = new HashMap<>();
        List<City> cities = Arrays.asList(kiev, vinnytsia, lviv);
        for (City city : cities) {
            cityPopulationV2.put(city.getName(), city.getPopulation());
        }
        System.out.println("cityPopulationV2 = " + cityPopulationV2);


        System.out.println(cityPopulation);

        int totalPopulation = cityPopulation
                .values()
                .stream()
                .mapToInt(it -> it)
                .sum();

        //Imperative version
        int totalPopulationV2 = 0;
        for (Integer population : cityPopulation.values()) {
            totalPopulationV2 += population;
        }
        System.out.println("totalPopulationV2 = " + totalPopulationV2);
        System.out.println("totalPopulation = " + totalPopulation);
    }
}
