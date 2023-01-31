
import ClassCircle.Circle;
import ClassCylinder.Cylinder;

public class App {
    public static void main(String[] args) throws Exception {
        Circle circle1 = new Circle(20, 10);

        System.out.println("Area of Circle : " + circle1.getArea());
        System.out.println("Parameter of Circle : " + circle1.getParameter());

        Cylinder cylinder1 = new Cylinder(10, 2);

        System.out.println("Volume of Cylinder : " + cylinder1.getVolume());

    }
}
