public class EquilateralTriangle extends Triangle {

    private double side;

    // constructor
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);
        this.side = side;
    }

    // getter
    public double getSide() {
        return side;
    }

    // setter
    public void setSide(double side) {
        this.side = side;
        setSides(side, side, side);
    }
}
