import java.util.function.BiFunction;

public enum Calculate {
    SUM((a, b) -> a + b, "+"),
    SUBTRACTION((a, b) -> a - b, "-"),
    MULTIPLY((a, b) -> a * b, "x"),
    DIVISION((a, b) -> {
        if (b == 0) throw new ArithmeticException("Divisão por zero!");
        return a / b;
    }, ":");

    private final BiFunction<Double, Double, Double> calculate;
    private final String symbol;

    Calculate(BiFunction<Double, Double, Double> calculate, String symbol) {
        this.calculate = calculate;
        this.symbol = symbol;
    }

    public BiFunction<Double, Double, Double> getCaclulate() {
        return calculate;
    }

    public String getSymbol() {
        return symbol;
    }
}