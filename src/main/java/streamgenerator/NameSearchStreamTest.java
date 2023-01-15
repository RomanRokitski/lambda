package streamgenerator;

import human.HumanGenerator1;

import java.util.List;
import java.util.stream.Collectors;

public class NameSearchStreamTest {
    public static void main(String[] args) {
        List<String> names = new HumanGenerator1()
                .generate(10)
                .stream()
                .filter(NameSearchStreamTest::isValidHumanName)
                .map(it -> it.getName())
                .collect(Collectors.toList());

        System.out.println("names = " + names);
    }

    private static boolean isValidHumanName(Human1 human1){
        String[] nameParts = human1.getName().split(" ");
        String lastName = nameParts[1];
        return lastName.contains("a");
    }
}
