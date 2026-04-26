public class Alimentacao implements TaxCalc{
    private final double taxPercentage = 0.01;

    @Override
    public double tributes(double value) {
        return (taxPercentage * value);
    }
}
