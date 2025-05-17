package pl.pp;

public class Person {
    private String forename;
    private String surname;
    private int yearOfBirth;
    private String address;

    public Person(String forename, String surname, int yearOfBirth) {
        this.forename = forename;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void hiToAll() {
        System.out.println("Hi! I'm " + forename + " " + surname + ".");
    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return 2025 - yearOfBirth;
    }

    // Yeni eklenen metodlar:

    public void growOld(int years) {
        this.yearOfBirth -= years;  // yaşlandıkça doğum yılı küçülür (daha eski olur)
    }

    public void beYounger() {
        this.yearOfBirth += 1;  // daha genç olmak için doğum yılını 1 yıl ileri al
    }

    public String getName() {
        return forename + " " + surname;
    }

    public void setName(String newName) {
        // Örnek olarak, yeni ismi boşlukla ayırıp forename ve surname olarak ayırıyoruz
        String[] parts = newName.split(" ");
        if (parts.length >= 2) {
            this.forename = parts[0];
            this.surname = parts[1];
        } else if (parts.length == 1) {
            this.forename = parts[0];
            this.surname = "";
        }
    }
}