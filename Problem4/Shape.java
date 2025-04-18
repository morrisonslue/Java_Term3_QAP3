public abstract class Shape implements Scalable {
    protected String name; // shape name

    // constructor
    public Shape(String name) {
        this.name = name;
    }

    // get shape name
    public String getName() {
        return name;
    }

    // set shape name
    public void setName(String name) {
        this.name = name;
    }

    // abstract methods for area and perimeter
    public abstract double getArea();

    public abstract double getPerimeter();

    // output
    @Override
    public String toString() {
        return name + " | Area: " + getArea() + " | Perimeter: " + getPerimeter();
    }

    @Override
    public abstract void scale(double factor);
}
