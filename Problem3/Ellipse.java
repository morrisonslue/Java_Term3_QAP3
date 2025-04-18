public class Ellipse extends Shape {
    private double a; // major axis
    private double b; // minor axis

    // constructor...assign the larger to a and smaller to b
    public Ellipse(String name, double value1, double value2) {
        super(name);
        if (value1 >= value2) {
            a = value1;
            b = value2;
        } else {
            a = value2;
            b = value1;
        }
    }

    // get area
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    // get perimeter...not sure about this formula
    @Override
    public double getPerimeter() {
        return Math.PI * Math.sqrt(2 * (a * a + b * b) - ((a - b) * (a - b)) / 2);
    }

    // get major axis
    public double getA() {
        return a;
    }

    // get minor axis
    public double getB() {
        return b;
    }

    // set major and minor
    public void setAxes(double value1, double value2) {
        if (value1 >= value2) {
            a = value1;
            b = value2;
        } else {
            a = value2;
            b = value1;
        }
    }
}
