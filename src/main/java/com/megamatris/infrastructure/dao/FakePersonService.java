package com.megamatris.infrastructure.dao;

import com.megamatris.infrastructure.model.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
import java.util.Vector;

/**
 * Created by Iman on 10/19/2020.
 */
@Repository("fakeDAO")
public class FakePersonService implements PersonDAO {
    List<Person> DB=new Vector<Person>();
    public FakePersonService()
    {
        UUID id=UUID.randomUUID();
        Person a=new Person(id,"iman");
        insert(a);
    }

    @Override
    public int insert(UUID uiid, Person person) {
        DB.add(new Person(uiid,person.getName()));
        return 1;
    }

    @Override
    public List<Person> getAllPerson() {
        return DB;
    }
}
