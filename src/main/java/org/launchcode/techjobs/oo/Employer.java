package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer {

    // FIELDS
    private int id;
    private static int nextId = 1;
    private String value;

    // CONSTRUCTORS
    // assigns a unique ID to each employer
    public Employer() {
        id = nextId; // assigns value of nextId to id
        nextId++; // increments nextId so each new employer gets a different id number
    }

    // calls the first constructor and initializes id
    public Employer(String value) {
        this(); // calls the first constructor
        this.value = value; // assigns value parameter to value field
    }

    // METHODS
    // Custom toString, equals, and hashCode methods:
    // returns the data stored in 'value'
    @Override
    public String toString() {
        return value;
    }

    // Two objects are equal if they have the same id.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    // gives the id a unique hashcode
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
