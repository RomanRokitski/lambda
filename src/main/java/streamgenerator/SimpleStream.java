package streamgenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimpleStream {
    public static void main(String[] args) {
        Random r = new Random();

        List<Integer> values = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            values.add(r.nextInt(10));
        }
        System.out.println("values = " + values);

        int sum = values
                .stream()
                .mapToInt(it -> it)
                .filter(it -> it % 2 == 0)
                .sum();

        System.out.println("sum = " + sum);
    }
}
