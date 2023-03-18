package org.launchcode.techjobs.oo;

import java.util.Objects;

// TASK 6: EXTEND JOB FIELD INTO EMPLOYER
// TODO 1: Modify line 5 to extend the JobField class into Employer.
public class Employer extends JobField {

    // TODO 2: Next, remove any code in Employer that matches code from JobField (e.g. the id, value, and nextId fields are shared).

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
//        if (!(o instanceof Employer)) return false;
//        Employer employer = (Employer) o;
//        return getId() == employer.getId();
//    }

    // gives the id a unique hashcode
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }

    // TODO 5: The empty constructor is shared, but not the second. Replace the two constructors (with the code provided).
    // The extends and super keywords link the JobField and Employer classes.

    // CONSTRUCTORS
    // assigns a unique ID to each employer
//    public Employer() {
//        id = nextId; // assigns value of nextId to id
//        nextId++; // increments nextId so each new employer gets a different id number
//    }

    // calls the first constructor and initializes id
//    public Employer(String value) {
//        this(); // calls the first constructor
//        this.value = value; // assigns value parameter to value field
//    }

    // PROVIDED REPLACEMENT CODE:

    public Employer(String value) {
        // constructors are not inherited, so we have to use super to access the constructors in JobField
        super(value);
    }

    // TODO 6: Rerun your unit tests to verify your refactored code.
    // TestTaskTwo, TestTaskThree, and JobTest all tests pass. TestTaskFour, TestTaskFive, and TestTaskSix partially pass.

}
