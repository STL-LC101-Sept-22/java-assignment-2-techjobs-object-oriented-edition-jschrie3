package org.launchcode.techjobs.oo;


// TASK 6: CREATE A BASE CLASS

import java.util.Objects;

// TODO 1: Create a new class called JobField in the package org.launchcode.techjobs.oo.
// TODO 7: Finally, to prevent the creation of a JobField object, make this class abstract.

public abstract class JobField {

    // TODO 2: Consider the following questions to help you decide what code to put in the JobField class:
    /*

    What fields do ALL FOUR of the classes have in common?
    * id, nextId, and value

    Which constructors are the same in ALL FOUR classes?
    * the constructor that assigns the unique ID's and the secondary constructor that calls the first constructor and initializes the id field

    What getters and setters do ALL of the classes share?
    * both getter and setter for value; just getter for id

    Which custom methods are identical in ALL of the classes?
    * custom tostring, hashcode, and equals methods are present in all classes

    */

    // TODO 3: In JobField, declare each of the common fields.
    // FIELDS
    private int id;
    private static int nextId = 1;
    private String value;

    // TODO 4: Code the constructors.
    // CONSTRUCTORS
    // assigns a unique ID to each JobField
    public JobField() {
        id = nextId; // assigns value of nextId to id
        nextId++; // increments nextId so each new JobField gets a different id number
    }

    // calls the first constructor and initializes id
    public JobField(String value) {
        this(); // calls the first constructor
        this.value = value; // assigns value parameter to value field
    }

    // TODO 5: Use Generate to create the appropriate getters and setters.
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

    // TODO 6: Add in the custom methods.
    // METHODS
    // returns the data stored in 'value'
    @Override
    public String toString() {
        return value;
    }

    // Two objects are equal if they have the same id.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    // gives the id a unique hashcode
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
