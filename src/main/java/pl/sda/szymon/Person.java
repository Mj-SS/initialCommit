package pl.sda.szymon;

import java.time.LocalDate;

public class Person {

    private String firstName;
    private String lastName;
    private String  peselNumber;
    private LocalDate dataOfBirth;

    public Person(String firstName, String lastName, String peselNumber, LocalDate dataOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselNumber = peselNumber;
        this.dataOfBirth = dataOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPeselNumber() {
        return peselNumber;
    }

    public LocalDate getDataOfBirth() {
        return dataOfBirth;
    }
}
