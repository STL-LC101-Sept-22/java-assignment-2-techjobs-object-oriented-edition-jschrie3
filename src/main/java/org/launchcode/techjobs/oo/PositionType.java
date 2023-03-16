package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType {

    // FIELDS
    private int id;
    private static int nextId = 1;
    private String value;

    // CONSTRUCTORS
    // assigns a unique ID to each position type
    public PositionType() {
        id = nextId; // assigns value of nextId to id
        nextId++; // increments nextId so each new employer gets a different id number
    }

    // calls the first constructor and initializes id
    public PositionType(String value) {
        this(); // calls the first constructor
        this.value = value; // assigns value parameter to value field
    }

    // METHODS
    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    @Override
    public String toString() {
        return value;
    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.
    // Two objects are equal if they have the same id.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType that = (PositionType) o;
        return id == that.id;
    }

    // gives the id a unique hashcode
    @Override
    public int hashCode() {
        return Objects.hash(id);
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
