public class ShapeCalculator {

    double squareArea(Square square) {
        return square.side * square.side;
    }

    double squarePerimeter(Square square) {
        return 4 * square.side;
    }

    double rectArea(Rectangle rectangle) {
        return rectangle.longSide * rectangle.shortSide;
    }

    double rectPerimeter(Rectangle rectangle) {
        return 2 * (rectangle.shortSide + rectangle.longSide);
    }

    double circleArea(Circle circle) {
        return 3.14 * circle.radius * circle.radius;
    }

    double circlePerimeter(Circle circle) {
        return 2 * 3.14 * circle.radius;
    }

    double triangleArea(Triangle triangle) {
        double p = (triangle.a + triangle.b + triangle.c) * 0.5; // Half of triangle circumference
        double auxiliaryVariable = p * (p - triangle.a) * (p - triangle.b) * (p - triangle.c); // Heron's formula
        return Math.sqrt(auxiliaryVariable);
    }

    double trianglePerimeter(Triangle triangle) {
        return triangle.a + triangle.b + triangle.c;
    }
}
