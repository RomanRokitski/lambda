package human.stream;

import human.Human;
import human.HumanGenerator;

import java.util.List;
import java.util.stream.Collectors;

public class HumanStreamTest {
    public static void main(String[] args) {
        HumanGenerator generator = new HumanGenerator();

        System.out.println("generator.generate(5) = " + generator.generate(5));

        //Get all humans with salary > 1000

//        List<Human> highSalaryPeople = generator
//                .generate(100)
//                .stream()
//                .peek(human -> System.out.println("Before Filter : " + human))
//                .filter(human -> human.getSalary() > 1000)
//                .peek(human -> System.out.println("After Filter : " + human))
//                .collect(Collectors.toList());


//                System.out.println("highSalaryPeople.size() = " + highSalaryPeople.size());
//                System.out.println(highSalaryPeople);

        //Get humans with unique names
//
//        List<Human> humansWithDistinctNames = generator
//                .generate(100)
//                .stream()
//                .distinct()
//                .peek(h -> System.out.println(h))
//                .collect(Collectors.toList());

        // Sort by salary

//        List<Human> sorted = generator
//                .generate(10)
//                .stream()
//                .sorted((h1, h2) -> h1.getSalary() - h2.getSalary())
//                .sorted((h1, h2) -> h1.getName().compareToIgnoreCase(h2.getName()))
//                .peek(System.out::println)
//                .collect(Collectors.toList());
        
        //Find with max salary

//        List<Human> withMaxSalary = generator
//                .generate(10)
//                .stream()
//                .sorted((h1, h2) -> h2.getSalary() - h1.getSalary())
//                .skip(1)
//                .limit(1)
//                .peek(System.out::println)
//                .collect(Collectors.toList());

        //Mark Koline -> MARK koline

        generator
                .generate(10)
                .stream()
                .map(human -> {
                    String[] nameParts = human.getName().split(" ");
                    String newName = nameParts[0].toUpperCase() + " " + nameParts[1].toLowerCase();

                    return new Human(newName, human.getSalary());
                })
                .map(human -> new Human(human.getName(), human.getSalary() * 2))
                .map(human -> human.getName() + ": " + human.getSalary())
                .filter(it -> it.toLowerCase().contains("a"))
                .filter(it -> it.charAt(it.length() - 1) == '2')
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
