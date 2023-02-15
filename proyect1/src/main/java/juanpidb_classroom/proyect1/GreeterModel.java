package juanpidb_classroom.proyect1;

public class GreeterModel {
    private final String firstName;
    private final String lastName;

    public GreeterModel(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

