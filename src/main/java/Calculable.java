@FunctionalInterface
interface Calculable {
    int calc(int a, int b);
}

class Calculator {

    public int calc(int a, int b, Calculable calculable) {
        return calculable.calc(a, b);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int c = calculator.calc(2, 3, (a, b) -> a + b);
        System.out.println(c);
    }
}
