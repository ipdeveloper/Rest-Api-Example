package com.megamatris.infrastructure.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

/**
 * Created by Iman on 10/19/2020.
 */
public class Person {
    private String name;
    private UUID id;

    public Person(@JsonProperty("id") UUID id,@JsonProperty("name") String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
