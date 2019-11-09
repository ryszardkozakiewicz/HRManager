package pl.rk.hrmanager.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.rk.hrmanager.model.Person;


@Repository
public interface PersonCrudRepository extends PersonRepository {

    @Query(value = "SELECT p FROM Person p WHERE p.pesel = :pesel")
    Person findPersonByPesel(Long pesel);

}
