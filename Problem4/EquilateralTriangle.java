public class EquilateralTriangle extends Triangle {

    // constructor
    public EquilateralTriangle(String name, double sideLength) {
        super(name, sideLength, sideLength, sideLength);
    }

    // scale the triangle
    @Override
    public void scale(double factor) {
        double newSide = getSide1() * factor;
        setSide1(newSide);
        setSide2(newSide);
        setSide3(newSide);
    }
}
