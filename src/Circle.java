public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double circleArea() {
        return 3.14 * this.radius * this.radius;
    }

    double circlePerimeter() {
        return 2 * 3.14 * this.radius;
    }

}
