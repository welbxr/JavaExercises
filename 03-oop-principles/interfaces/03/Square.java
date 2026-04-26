public record Square(double side) implements Geometrics
{
    @Override
    public double calculateArea() {
        // Calculates the first argument raised to the power of the second
        return (Math.pow(side, 2));
    }
}
