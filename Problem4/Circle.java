public class Circle extends Shape {
    private double radius;

    // constructor
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    // get radius
    public double getRadius() {
        return radius;
    }

    // set radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // get area
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // get perimeter
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // scale radius by factor
    @Override
    public void scale(double factor) {
        radius = radius * factor;
    }
}
