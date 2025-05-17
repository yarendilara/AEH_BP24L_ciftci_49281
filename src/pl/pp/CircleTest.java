package pl.pp;

public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);  // Constructor kullanılıyor

        System.out.println(c);       // toString, getArea, getCircumference çağrılıyor

        System.out.println("Radius: " + c.getRadius());  // getRadius çağrılıyor

        c.setRadius(10.0);           // setRadius çağrılıyor
        System.out.println(c);
    }
}
