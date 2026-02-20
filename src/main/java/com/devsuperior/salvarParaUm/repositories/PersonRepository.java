package com.devsuperior.salvarParaUm.repositories;

import com.devsuperior.salvarParaUm.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
