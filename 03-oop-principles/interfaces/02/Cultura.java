public class Cultura implements TaxCalc
{
    private final double taxPercentage = 0.04;

    @Override
    public double tributes(double value) {
        return (taxPercentage * value);
    }
}
