package Simple;

class Admin extends User {

    public Admin(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
