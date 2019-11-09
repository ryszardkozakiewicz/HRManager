package pl.rk.hrmanager.services;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pl.rk.hrmanager.model.Person;
import pl.rk.hrmanager.model.PersonRequest;
import pl.rk.hrmanager.repository.PersonCrudRepository;

import java.util.List;

@Service
public class PersonService {

    private final PersonCrudRepository personCrudRepository;

    public PersonService(PersonCrudRepository personCrudRepository) {
        this.personCrudRepository = personCrudRepository;
    }


    public void addPerson(PersonRequest personRequest) {

        Person person = new Person(
                personRequest.getPesel(),
                personRequest.getName(),
                personRequest.getSurname(),
                personRequest.getSex(),
                personRequest.getSalary(),
                personRequest.getPenality(),
                personRequest.getEmploymentData()
        );

        personCrudRepository.save(person);
    }


    public List<Person> getPersonsListSortedByName() {
        return personCrudRepository.findAll(Sort.by("name"));
    }

    public Person getPersonByPesel(Long pesel){
        return  personCrudRepository.findPersonByPesel(pesel);
    }

}
