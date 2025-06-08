package pl.pp;

import pl.pp.Person;

class mySeventhApp {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.hiToAll();

        person1.forename = "John";
        person1.surname = "Doe";
        person1.age = 24;
        person1.hiToAll();

        Person person2 = new Person("Alice", "Hart", 42);
        person2.hiToAll();

        person1.growOld();
        for (int i = 0; i < 3; i++) {
            person2.growOld();
        }

        person1.hiToAll();
        person2.hiToAll();

        System.out.println(person1.getName());
        person1.setName("Lolo");
        System.out.println(person1.getName());
        person1.hiToAll();
    }
}