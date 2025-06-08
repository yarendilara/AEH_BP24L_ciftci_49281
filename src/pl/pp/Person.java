package pl.pp;

public class Person {
    private String forename;
    private String surname;
    private int age;

    public Person() {
        this.forename = "";
        this.surname = "";
        this.age = 0;
    }

    public Person(String initForename, String initSurname, int initAge) {
        this.forename = initForename;
        this.surname = initSurname;
        this.age = initAge;
    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void hiToAll() {
        System.out.println("My name is " + forename + " " + surname + ". " + "I am " + age + " years old.");
    }

    public int growOld() {
        age = age + 1;
        return age;
    }

    public String getName() {
        return forename;
    }

    public void setName(String nameToSet) {
        this.forename = nameToSet;
    }
}