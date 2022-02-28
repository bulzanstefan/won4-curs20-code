package ro.fasttracklit.curs20.controller;

import org.springframework.web.bind.annotation.*;
import ro.fasttracklit.curs20.entity.Person;
import ro.fasttracklit.curs20.service.PersonService;

import java.util.List;

@RestController
@RequestMapping("persons")
public class PersonController {
    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping
    List<Person> getAll() {
        return service.getAll();
    }

    @PostMapping
    Person addOne(@RequestBody Person person) {
        return service.addOne(person);
    }

}
