package pl.rk.hrmanager.controller;

import org.springframework.web.bind.annotation.*;
import pl.rk.hrmanager.model.Person;
import pl.rk.hrmanager.model.PersonRequest;
import pl.rk.hrmanager.services.PersonService;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public String hello() {
        return "Hello";
    }

    @PostMapping("/add")
    public void addPerson(@Valid @RequestBody PersonRequest personRequest) {
        personService.addPerson(personRequest);
    }

    @GetMapping("/list")
    public List<Person> getPersonsList(@RequestParam(required = false) String name) {
        if (name != null) {
            return personService.getPersonsListSortedByName().stream()
                    .filter(person -> person.getName().startsWith(name))
                    .collect(Collectors.toList());
        }
        return personService.getPersonsListSortedByName();
    }

    @GetMapping("/pesel/{pesel}")
    public Person getPersonByPesel(@PathVariable Long pesel) {
        return personService.getPersonByPesel(pesel);
    }





}
