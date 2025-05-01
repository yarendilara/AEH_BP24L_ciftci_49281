package pl.pp;

public class mySeventhApp {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.hiToAll();

        person1.forename = "Anna";
        person1.surname = "Nowak";
        person1.age = 22;
        person1.address = "ul. Kwiatowa 12, Warszawa";
        person1.yearOfBirth = 2002;
        person1.hiToAll();

        Person person2 = new Person("Marek", "Kowalski", 35);
        person2.address = "ul. Słoneczna 5, Kraków";
        person2.yearOfBirth = 1989;
        person2.hiToAll();

        person1.growOld(6);
        for (int i = 0; i < 2; i++) {
            person2.growOld(4);
        }

        person1.hiToAll();
        person2.hiToAll();

        System.out.println(person1.getName());
        person1.setName("Kasia");
        System.out.println(person1.getName());
        person1.hiToAll();

        person1.beYounger();
        person1.hiToAll();
    }
}
