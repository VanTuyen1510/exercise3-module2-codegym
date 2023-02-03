package Main3;

public class BuilFanClass {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean newOn) {
        this.on = newOn;
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double newRadius) {

        this.radius = newRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {

        this.color = newColor;
    }

    public BuilFanClass() {
        this(SLOW, false, 5, "blue");
    }

    public BuilFanClass(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }


    public String toString() {
        if (isOn() == true) {
            return "Fan{" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + "' fan is on" +
                    '}';
        } else {
            return "Fan{" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + "' fan is off" +
                    '}';
        }
    }

    public static void main(String[] args) {
        BuilFanClass fanFirst = new BuilFanClass(FAST, true, 10, "yellow");
        BuilFanClass fanSecond = new BuilFanClass(MEDIUM, false, 5, "blue");
        System.out.println(fanFirst);
        System.out.println(fanSecond);
    }
}
