package nl.hu.intergrationcommunication.model;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {

    @Test
    public void shouldHaveBirtDate() {
        Person person = new Person();
        person.setName("Jan");
        person.setSurname("Jansen");
        person.setBirthDate(LocalDate.of(1990, Month.JULY, 16));

        assertThat(person.getName()).isEqualTo("Jan");
        assertThat(person.getSurname()).isEqualTo("Jansen");
        assertThat(person.getBirthDate()).isNull(); //TODO Change this to assert that it is not null and find bug so test will pass again
    }

}
