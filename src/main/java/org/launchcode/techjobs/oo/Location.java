package org.launchcode.techjobs.oo;

import java.util.Objects;

// TASK 7: EXTEND JOB FIELD INTO EMPLOYER
// FINISH DRYING YOUR CODE
// TODO: Repeat the process above for the Location, CoreCompetency, and PositionType classes.
// TODO 1: Modify line 5 to extend the JobField class into (Location).

public class Location extends JobField {

    // TODO 2: Next, remove any code in (Location) that matches code from JobField (e.g. the id, value, and nextId fields are shared).

    // FIELDS
//    private int id;
//    private static int nextId = 1;
//    private String value;

    // TODO 3: Remove any of the getters and setters that are the same.

    // GETTERS AND SETTERS
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }

    // TODO 4: Remove any of the custom methods that are identical.

    // METHODS
    // Custom toString, equals, and hashCode methods:
    // returns the data stored in 'value'
//    @Override
//    public String toString() {
//        return value;
//    }

    // Two objects are equal if they have the same id.
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Location)) return false;
//        Location location = (Location) o;
//        return getId() == location.getId();
//    }

    // gives the id a unique hashcode
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }

    // TODO 5: The empty constructor is shared, but not the second. Replace the two constructors (with the code provided).
    // The extends and super keywords link the JobField and Employer classes.

    // CONSTRUCTORS
    // assigns a unique ID to each location
//    public Location() {
//        id = nextId; // assigns value of nextId to id
//        nextId++; // increments nextId so each new location gets a different id number
//    }

    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.

    // calls the first constructor and initializes id
//    public Location(String value) {
//        this(); // calls the first constructor
//        this.value = value;  // assigns value parameter to value field
//    }

    // PROVIDED REPLACEMENT CODE:

    public Location(String value) {
        // constructors are not inherited, so we have to use super to access the constructors in JobField
        super(value);
    }
}
