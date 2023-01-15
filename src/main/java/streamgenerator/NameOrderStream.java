package streamgenerator;

import human.HumanGenerator1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class NameOrderStream {
    public static void main(String[] args) {
        AtomicInteger order = new AtomicInteger(1);

        new HumanGenerator1()
                .generate(10)
                .stream()
                .map(Human1::getName)
                .map(name -> order.getAndIncrement() + ". " + name)
                .peek(System.out::println)
                .collect(Collectors.toList());


    }
}
