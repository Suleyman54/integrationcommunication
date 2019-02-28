package nl.hu.intergrationcommunication.model;

import java.time.LocalDate;

public class Person {

    private String name;
    private String surname;
    private LocalDate birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        if (birthDate != null) {
            if (birthDate.isAfter(LocalDate.now())) {
                this.birthDate = birthDate;
            }
        }
    }
}
