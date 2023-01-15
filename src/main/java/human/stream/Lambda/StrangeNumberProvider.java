package human.stream.Lambda;

public class StrangeNumberProvider implements NumberProvider {

    private NumberProvider[] providers = {
            new RandomNumberProvider(),
            new NumberProvider42()
};
    private int index = 0;

    @Override
    public int generateNext() {
        return providers[(index++) % 2].generateNext();
    }
}

