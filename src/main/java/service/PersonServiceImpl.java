package service;

import dto.PersonDto;
import model.Address;
import model.Person;

import java.util.Collections;
import java.util.List;

public class PersonServiceImpl implements PersonService {

    public Person create(PersonDto personDto) {

        // creating mock object
        Person person = new Person();
        person.setName("Name Recived");
        person.setId(45);
        person.setId(1);
        Address address = new Address("Street recived", 44);
        person.setAddress(address);

        return person;
    }

    public List<Person> listAll() {
        return Collections.emptyList();
    }

    public Person get(Integer id) {
        return null;
    }
}
