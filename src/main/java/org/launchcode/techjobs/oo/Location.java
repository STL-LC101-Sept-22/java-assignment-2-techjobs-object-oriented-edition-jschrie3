package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location {

    // FIELDS
    private int id;
    private static int nextId = 1;
    private String value;

    // CONSTRUCTORS
    // assigns a unique ID to each location
    public Location() {
        id = nextId; // assigns value of nextId to id
        nextId++; // increments nextId so each new location gets a different id number
    }

    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.

    // calls the first constructor and initializes id
    public Location(String value) {
        this(); // calls the first constructor
        this.value = value;  // assigns value parameter to value field
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
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return getId() == location.getId();
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
