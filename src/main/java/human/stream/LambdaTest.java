package human.stream;

import human.Human;

import java.util.function.Function;
import java.util.stream.Stream;

public class LambdaTest {
    public static void main(String[] args) {

        Human john = new Human("John", 1000);
        Human igor = new Human("Igor", 1500);
        Human mark = new Human("Mark", 800);

        Stream<Human> humans = Stream.of(john, igor, mark);

//        Stream<Integer> intStream = humans
//                .map(human -> human.getSalary());

//        long count = humans
//                .map(human -> human.getSalary())
//                .count();
//
//        System.out.println(count);

        double avg = humans.map(human -> human.getSalary())
                .mapToLong(it -> it)
                .average()
                .getAsDouble();

        System.out.println("avg = " + avg);


        //Проміжні методи
        //Термінальні методи
        /*
        //name - John
        //salary - 1000

        //name - Igor
        //salary - 1500

        //name - Mark
        //salary - 800
         */

        // 1) Преобрезовать Human -> Integer
        // 2) Применить операцию AVG (поиск среднего) над массивом чисел


    }
}
