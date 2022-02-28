package ro.fasttracklit.curs20.service;

import org.springframework.stereotype.Service;
import ro.fasttracklit.curs20.entity.Person;
import ro.fasttracklit.curs20.repository.PersonRepository;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> getAll() {
        return repository.findAll();
    }

    public Person addOne(Person person) {
        return repository.save(person);
    }
}
