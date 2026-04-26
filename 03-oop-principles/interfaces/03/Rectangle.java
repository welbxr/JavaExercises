public record Rectangle(double height, double base) implements Geometrics
{
    @Override
    public double calculateArea() {
        return (height * base);
    }
}
