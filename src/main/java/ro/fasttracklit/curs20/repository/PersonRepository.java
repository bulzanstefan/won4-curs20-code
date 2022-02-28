package ro.fasttracklit.curs20.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttracklit.curs20.entity.Person;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    List<Person> findByName(String name);

    List<Person> findByNameAndCity(String name, String city);
}
