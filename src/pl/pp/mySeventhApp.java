package pl.pp;

class Person {
    public String forename;
    public String surname;
    public int age;

    // Default constructor (no arguments)
    public Person() {
        this.forename = "";
        this.surname = "";
        this.age = 0;
    }

    // Constructor with parameters
    public Person(String forename, String surname, int age) {
        this.forename = forename;
        this.surname = surname;
        this.age = age;
    }

    // Method to say hi and show information
    public void hiToAll() {
        System.out.println("Hi! My name is " + forename + " " + surname + " and I am " + age + " years old.");
    }

    // Method to grow old by 1 year
    public void growOld() {
        this.age += 1;
    }

    // New method: grow old by 'n' years
    public void growOld(int n) {
        this.age += n;
    }

    // New method: get younger by 'n' years (but not less than 0)
    public void toYoung(int n) {
        this.age -= n;
        if (this.age < 0) {
            this.age = 0;
        }
    }

    // Getter for forename
    public String getName() {
        return this.forename;
    }

    // Setter for forename
    public void setName(String forename) {
        this.forename = forename;
    }
}