package human;

public class HumanToIntegerTransformersTests {
    public static void main(String[] args) {
        Human human = new Human("John", 1000);

//        HumanToIntegerTransformer transformer =
//                new HumanToIntegerTransformerImpl();
//
//        System.out.println(transformer.transform(human));

//
                    //Human h
        HumanToIntegerTransformer transformer = h -> h.getSalary();
        System.out.println(transformer.transform(human));
    }
}
