package human.stream.random;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMergeTests {
    public static void main(String[] args) {
        Stream<String> streamA = Stream.of("Alpha", "Beta", "Gamma");
        Stream<String> streamB = Stream.of("1", "2", "3");

        Stream<String> result = zipIterators(streamA, streamB);
        //Expect - Alpha, 1, Beta, 2, Gamma, 3

        result.peek(System.out::println).collect(Collectors.toList());

    }

    //    public static <T> Stream<T> zip(Stream<T> streamA, Stream<T> streamB) {
//        List<T> streamAItems = streamA.collect(Collectors.toList());
//        List<T> streamBItems = streamB.collect(Collectors.toList());
//
//        int minSize = Math.min(streamAItems.size(), streamBItems.size());
//
//        List<T> resultList = new ArrayList<>();
//
//        for (int i = 0; i < minSize; i++) {
//            resultList.add(streamAItems.get(i));
//            resultList.add(streamBItems.get(i));
//
//        }
//
//
//        return resultList.stream();
//    }
    public static <T> Stream<T> zipIterators(Stream<T> streamA, Stream<T> streamB) {
        List<T> resultList = new ArrayList<>();

        Iterator<T> iteratorA = streamA.iterator();
        Iterator<T> iteratorB = streamB.iterator();

        while (iteratorA.hasNext() && iteratorB.hasNext()) {
            resultList.add(iteratorA.next());
            resultList.add(iteratorB.next());
        }

        return resultList.stream();
    }
}
