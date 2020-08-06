package service;

import dto.PersonDto;
import model.Person;
import org.junit.Test;
import util.databuilder.PersonDataBuilder;
import util.databuilder.PersonDtoDataBuilder;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class PersonServiceTest {

    private PersonService personService = new PersonServiceImpl();
    private PersonDataBuilder personDataBuilder = new PersonDataBuilder();
    private PersonDtoDataBuilder personDtoDataBuilder = new PersonDtoDataBuilder();

    @Test
    public void testCreate() {

        PersonDto personDto = personDtoDataBuilder.getPersonDto();

        Person personReturned = personService.create(personDto);

        Person personExpected = personDataBuilder.getExpectedPerson();

        assertEquals(personExpected, personReturned);

    }

    @Test
    public void testCreateAssertJ() {

        PersonDto personDto = personDtoDataBuilder.getPersonDto();

        Person personReturned = personService.create(personDto);

        Person personExpected = personDataBuilder.getExpectedPerson();

        assertThat(personExpected)
                .isEqualToComparingFieldByField(personReturned);
    }

    @Test
    public void testCreateDONTDOTHIS() {

        PersonDto personDto = personDtoDataBuilder.getPersonDto();

        Person personReturned = personService.create(personDto);

        Person personExpected = personDataBuilder.getExpectedPerson();

        assertEquals(0, personReturned.getAge());
        assertEquals("Name Recived", personReturned.getName());
        assertEquals("Street recived", personReturned.getAddress().getStreet());
        assertEquals(44, personReturned.getAddress().getNumber());

    }

    @Test
    public void testObjectsWithAssertJ(){

        PersonDto personDto   = personDtoDataBuilder.getPersonDto();

        Person personReturned = personService.create(personDto);
        Person personExpected = personDataBuilder.getExpectedPerson();

        assertThat(personReturned).isEqualToComparingFieldByField(personExpected);
    }

    @Test
    public void listAll() {
    }

    @Test
    public void get() {
    }
}