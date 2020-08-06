package util.databuilder;

import model.Address;
import model.Person;

public class PersonDataBuilder {

    public Person getExpectedPerson(){


        Person person = new Person();
        person.setAge(0);
        person.setId(1);
        person.setName("Name Recived");

        Address address = new Address("Street recived", 44);

        person.setAddress(address);

        return person;
    }
}
