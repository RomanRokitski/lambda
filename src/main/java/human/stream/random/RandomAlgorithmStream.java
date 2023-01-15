package human.stream.random;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomAlgorithmStream {
    public static void main(String[] args) {
        RandomAlgorithm r = new RandomAlgorithm(10,30);
        Stream<Integer> stream =
                Stream.iterate(0, (seed) -> r.c(seed).next());

        stream.limit(10).peek(System.out::println).collect(Collectors.toList());
    }
}
