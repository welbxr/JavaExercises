public class Vestuario implements TaxCalc{
    private final double taxPercentage = 0.025;

    @Override
    public double tributes(double value) {
        return (taxPercentage * value);
    }
}
