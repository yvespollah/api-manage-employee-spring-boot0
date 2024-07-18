package com.example.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.api.model.Employee;

//  @Repository est une annotation Spring pour indiquer que la classe est un bean

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    
}

/*
 * CrudRepository est une interface fournie par Spring. Elle fournit des méthodes pour manipuler votre entité. Elle utilise la généricité pour que son code soit applicable à n’importe quelle entité, d’où la syntaxe “CrudRepository<Employee, Long>
 */