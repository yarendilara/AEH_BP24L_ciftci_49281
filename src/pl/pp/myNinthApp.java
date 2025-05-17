package pl.pp;
public class myNinthApp {
    public static void main(String[] args) {
        // Test Warehouse
        Warehouse warehouse = new Warehouse(1, 5000, "John Doe", "john@example.com", "+48 111 222 333");
        warehouse.addGoods(3000);
        warehouse.removeGoods(1000);
        warehouse.addGoods(2500);
        warehouse.checkOccupancy();
        warehouse.updateContact("owner@magazyn.pl", "+48 123 456 789");
        warehouse.addGoods(1000);

        // Test Circle
        Circle circle = new Circle(7.0);
        System.out.println(circle);
        circle.setRadius(10.0);
        System.out.println("Updated circle: " + circle);

        // Test Person
        Person person = new Person("Alice", "Smith", 2000);
        person.hiToAll();
        person.growOld(3);
        person.beYounger();
        System.out.println("Person name: " + person.getName());
        person.setName("Alicia");
        person.hiToAll();
    }
}
