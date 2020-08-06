package util.databuilder;

import dto.PersonDto;

public class PersonDtoDataBuilder {

    public PersonDto getPersonDto(){

        PersonDto personDto = new PersonDto();
        personDto.setAge(30);

        return personDto;
    }
}
