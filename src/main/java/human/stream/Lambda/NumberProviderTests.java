package human.stream.Lambda;

import java.util.Random;

public class NumberProviderTests {
    public static void main(String[] args) {
        NumberProvider provider = () -> new Random().nextInt();

        for (int i = 0; i < 10; i++) {

            System.out.println("provider.generateNext() = " + provider.generateNext());
        }
    }
}
