public class Triangle {
    double a, b, c, h;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
