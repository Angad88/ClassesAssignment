package ClassCircle;

public class Circle {
    public int diameter;
    public int radius;

    public Circle(int diameter, int radius) {
        this.diameter = diameter;
        this.radius = radius;
    }

    public int getArea() {
        return (int) ((this.radius) * Math.PI);
    }
    public int getParameter() {
        return (int) ((this.diameter) * Math.PI);
    }


}