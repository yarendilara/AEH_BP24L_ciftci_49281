package pl.pp;

public class Person {
    String forename;
    String surname;
    int age;
    String address;
    int yearOfBirth;

    public Person() {
        this.forename = "DefaultFirstName";
        this.surname = "DefaultLastName";
        this.age = 0;
        this.address = "Unknown address";
        this.yearOfBirth = 0;
    }

    public Person(String forename, String surname, int age) {
        this.forename = forename;
        this.surname = surname;
        this.age = age;
    }

    public void hiToAll() {
        System.out.println("Hello! My name is " + forename + " " + surname + ", I am " + age + " years old.");
        System.out.println("My address: " + address + ", year of birth: " + yearOfBirth);
    }

    public void growOld(int years) {
        this.age += years;
    }

    public void beYounger() {
        this.age -= 1;
    }

    public String getName() {
        return this.forename;
    }

    public void setName(String newName) {
        this.forename = newName;
    }
}

