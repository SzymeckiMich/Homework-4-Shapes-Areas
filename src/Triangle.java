public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    double triangleArea() {
        double p = (this.a + this.b + this.c) * 0.5; // Half of triangle circumference
        double auxiliaryVariable = p * (p - this.a) * (p - this.b) * (p - this.c); // Heron's formula
        return Math.sqrt(auxiliaryVariable);
    }

    double trianglePerimeter() {
        return this.a + this.b + this.c;
    }
}
