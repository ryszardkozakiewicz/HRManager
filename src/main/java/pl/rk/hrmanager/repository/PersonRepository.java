package pl.rk.hrmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.rk.hrmanager.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {


}
