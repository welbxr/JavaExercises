public record Circle(double radius) implements Geometrics
{
    private static final double pi = 3.14;

    @Override
    public double calculateArea() {
        // Calculates the first argument raised to the power of the second
        return (pi * Math.pow(radius, 2));
    }
}
