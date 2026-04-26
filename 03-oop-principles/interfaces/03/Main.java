import java.util.Scanner;

void main()
{
    Circle circulo1 = new Circle(3);
    Rectangle retangulo1 = new Rectangle(8,2);
    Square quadrado1 = new Square(5);

    System.out.println(circulo1.calculateArea());
    System.out.println(retangulo1.calculateArea());
    System.out.println(quadrado1.calculateArea());
}