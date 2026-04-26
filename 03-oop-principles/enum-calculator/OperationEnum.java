import java.util.function.BiFunction;

public enum OperationEnum
{
    SUM(Integer::sum, "+"),
    SUBTRACTION((Integer v1, Integer v2) -> v1 - v2, "-"),
    MULTIPLY((Integer v1, Integer v2) -> v1 * v2, "x"),
    DIVISION((Integer v1, Integer v2) -> v1 / v2, ":");

    private final BiFunction<Integer, Integer, Integer> calculate;

    private final String symbol;

    public String getSymbol() {
        return symbol;
    }

    OperationEnum(BiFunction<Integer, Integer, Integer> calculate, String symbol) {
        this.calculate = calculate;
        this.symbol = symbol;
    }

    public BiFunction<Integer, Integer, Integer> getCalculate() {
        return calculate;
    }
}
