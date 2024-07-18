package com.example.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.model.Employee;
import com.example.api.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /*
     Premièrement, @RestController atteint 2 objectifs :

    Comme @Component, elle permet d’indiquer à Spring que cette classe est un bean.

    Elle indique à Spring d’insérer le retour de la méthode au format JSON dans le corps de la réponse HTTP. Grâce à ce deuxième point, les applications qui vont communiquer avec votre API accéderont au résultat de leur requête en parsant la réponse HTTP.
     */

    @GetMapping("/employees")
    public Iterable<Employee> getEmployees() {
        return employeeService.getEmployees();
    }
    

}

/*
 * Cela signifie que les requêtes HTTP de type GET à l’URL /employees exécuteront le code de cette méthode. Et ce code est tout simple : il s’agit d’appeler la méthode getEmployees() du service, ce dernier appellera la méthode findAll() du repository, et nous obtiendrons ainsi tous les employés enregistrés en base de données.
 */