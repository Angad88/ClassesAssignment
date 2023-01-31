package ClassCylinder;

public class Cylinder {
    public int height;
    public int radius;

    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public int getVolume() {
        return (int) (Math.PI  * ((radius * radius)) * height);
    }

}
