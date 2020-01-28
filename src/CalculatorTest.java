public class CalculatorTest {
    public static void main(String[] args) {
        Square square = new Square(5);
        Circle circle = new Circle(6);
        Triangle triangle = new Triangle(7,5,9);
        Rectangle rectangle = new Rectangle(8,7);
        ShapeCalculator calc = new ShapeCalculator();

        System.out.println("Area of square = " + calc.squareArea(square));
        System.out.println("Perimeter of square = " + calc.squarePerimeter(square));
        System.out.println("Area of circle = " + calc.circleArea(circle));
        System.out.println("Perimeter of circle = " + calc.circlePerimeter(circle));
        System.out.println("Area of rectangle = " + calc.rectArea(rectangle));
        System.out.println("Perimeter of rectangle = " + calc.rectPerimeter(rectangle));
        System.out.println("Area of triangle = " + calc.triangleArea(triangle));
        System.out.println("Perimeter of triangle = " + calc.trianglePerimeter(triangle));
    }
}
