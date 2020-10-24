package com.megamatris.infrastructure.dao;

import com.megamatris.infrastructure.model.Person;

import java.util.List;
import java.util.UUID;

/**
 * Created by Iman on 10/19/2020.
 */
public interface PersonDAO {
    int insert(UUID uiid, Person person);
    default int insert(Person person)
    {
        UUID id=UUID.randomUUID();
        return insert(id,person);
    }

    List<Person> getAllPerson();
}
