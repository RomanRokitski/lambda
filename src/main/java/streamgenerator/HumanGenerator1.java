package human;

import streamgenerator.Human1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class HumanGenerator1 {
    public Collection<Human1> generate(int count) {
        Random random = new Random();

        List<String> firstNames = List.of("John", "Bill", "Larry", "Igor");
        List<String> lastNames = List.of("Gate", "Petrov", "Mask", "Jalov");

        Collection<Human1> result = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String firstName = firstNames.get(random.nextInt(firstNames.size()));
            String lastName = lastNames.get(random.nextInt(lastNames.size()));

            String fullName = firstName + " " + lastName;

            int salary = 500 + random.nextInt(1001);

            result.add(new Human1(fullName, salary));
        }
        return result;
    }
}
