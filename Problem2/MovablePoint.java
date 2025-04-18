public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // constructors
    public MovablePoint() {
        super();
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        super(); // set default 0
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // getters
    // get x speed
    public float getXSpeed() {
        return xSpeed;
    }

    // set x speed
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    // get y speed
    public float getYSpeed() {
        return ySpeed;
    }

    // setters
    // set y speed
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // set the speeds
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // get both speeds
    public float[] getSpeed() {
        float[] speed = { xSpeed, ySpeed };
        return speed;
    }

    // move point and return itself
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    // output
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + "), speed=(" + xSpeed + ", " + ySpeed + ")";
    }
}
