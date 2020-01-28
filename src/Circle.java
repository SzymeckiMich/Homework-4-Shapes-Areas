public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double circleArea(Circle circle) {
        return 3.14 * circle.radius * circle.radius;
    }

    double circlePerimeter(Circle circle) {
        return 2 * 3.14 * circle.radius;
    }

}
