package service;

import dto.PersonDto;
import model.Person;

import java.util.List;

public interface PersonService {

    Person create(PersonDto personDto);
    List<Person> listAll();
    Person get(Integer id);
}
