package com.megamatris.infrastructure.restapi;

import com.megamatris.infrastructure.model.Person;
import com.megamatris.infrastructure.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Iman on 10/19/2020.
 */
@RequestMapping("/api/v1/person")
@RestController
public class PersonController {
    final private PersonService personService;
    @Autowired
    public PersonController(PersonService a)
    {
        this.personService=a;
    }

    @PostMapping("zeid_mohammad")
    public int addPerson(@RequestBody  Person a)
    {
        return personService.addPerson(a);
    }
    @GetMapping("/get")
    public List<Person> getPerson()
    {
        return personService.getAllPerson();
    }
}
