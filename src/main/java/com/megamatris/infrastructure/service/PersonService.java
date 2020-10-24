package com.megamatris.infrastructure.service;

import com.megamatris.infrastructure.dao.PersonDAO;
import com.megamatris.infrastructure.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Iman on 10/19/2020.
 */
@Service
public class PersonService {
    private final PersonDAO personDAO;

    @Autowired
    public PersonService(@Qualifier("fakeDAO") PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public int addPerson(Person a) {
        return personDAO.insert(a);
    }

    public List<Person> getAllPerson() {
        return personDAO.getAllPerson();
    }
}
