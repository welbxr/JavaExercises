public class SaudeBemEstar implements TaxCalc {
    private final double taxPercentage = 0.015;

    @Override
    public double tributes(double value) {
        return (taxPercentage * value);
    }
}
