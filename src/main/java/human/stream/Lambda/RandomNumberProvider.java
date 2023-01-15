package human.stream.Lambda;

import java.util.Random;

public class RandomNumberProvider implements NumberProvider {

    @Override
    public int generateNext() {
        return new Random().nextInt();
    }
}
