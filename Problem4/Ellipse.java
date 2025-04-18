public class Ellipse extends Shape {
    private double a; // major axis
    private double b; // minor axis

    // constructor
    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        if (axis1 >= axis2) {
            a = axis1;
            b = axis2;
        } else {
            a = axis2;
            b = axis1;
        }
    }

    // get a
    public double getA() {
        return a;
    }

    // set a
    public void setA(double a) {
        this.a = a;
    }

    // get b
    public double getB() {
        return b;
    }

    // set b
    public void setB(double b) {
        this.b = b;
    }

    // get area
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    // get perimeter
    @Override
    public double getPerimeter() {
        return Math.PI * 2 * Math.sqrt((a * a + b * b) / 2);
    }

    // scale a and b
    @Override
    public void scale(double factor) {
        a = a * factor;
        b = b * factor;
    }
}
