package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency {

    // FIELDS
    private int id;
    private static int nextId = 1;
    private String value;

    // CONSTRUCTORS
    // assigns a unique ID to each core competency
    public CoreCompetency() {
        this.id = nextId; // assigns value of nextId to id
        nextId++; // increments nextId so each new core competency gets a different id number
    }

    // calls the first constructor and initializes id
    public CoreCompetency(String value) {
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
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return id == that.id;
    }

    // gives the id a unique hashcode
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // GETTERS AND SETTERS
    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }
}
