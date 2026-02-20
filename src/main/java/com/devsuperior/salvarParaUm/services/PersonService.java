package com.devsuperior.salvarParaUm.services;

import com.devsuperior.salvarParaUm.dto.PersonDepartmentDTO;
import com.devsuperior.salvarParaUm.entity.Department;
import com.devsuperior.salvarParaUm.entity.Person;
import com.devsuperior.salvarParaUm.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;
    public PersonDepartmentDTO insert(PersonDepartmentDTO dto) {
        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        Department dept = new Department();
        dept.setId(dto.getDepartment().getId());

        entity.setDepartment(dept);
        entity = repository.save(entity);
        return new PersonDepartmentDTO(entity);
    }
}
