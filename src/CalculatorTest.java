public class CalculatorTest {
    public static void main(String[] args) {
        Square square = new Square(5);
        Circle circle = new Circle(6);
        Triangle triangle = new Triangle(7, 5, 9);
        Rectangle rectangle = new Rectangle(8, 7);

        double squareArea = square.squareArea();
        double squarePerimeter = square.squarePerimeter();
        double circleArea = circle.circleArea();
        double circlePerimeter = circle.circlePerimeter();
        double rectangleArea = rectangle.rectArea();
        double rectanglePerimeter = rectangle.rectPerimeter();
        double triangleArea = triangle.triangleArea();
        double trianglePerimeter = triangle.trianglePerimeter();

        System.out.println("Area of square = " + squareArea);
        System.out.println("Perimeter of square = " + squarePerimeter);
        System.out.println("Area of circle = " + circleArea);
        System.out.println("Perimeter of circle = " + circlePerimeter);
        System.out.println("Area of rectangle = " + rectangleArea);
        System.out.println("Perimeter of rectangle = " + rectanglePerimeter);
        System.out.println("Area of triangle = " + triangleArea);
        System.out.println("Perimeter of triangle = " + trianglePerimeter);
    }
}
