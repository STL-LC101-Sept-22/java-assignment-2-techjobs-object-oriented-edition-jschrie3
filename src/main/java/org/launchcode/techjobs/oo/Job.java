package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    // FIELDS
    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    //CONSTRUCTORS
    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // assigns a unique ID to each job
    public Job() { // constructor takes no parameters
        id = nextId; // assigns value of nextId to id
        nextId++; // increments nextId so each new employer gets a different id number
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this(); // calls the first constructor to initialize id
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // METHODS
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // Two objects are equal if they have the same id.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }
    // gives the id a unique hashcode
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // CUSTOM TOSTRING METHOD
    // TODO 1: When passed a Job object, it should return a string that contains a blank line before
    //  and after the job information.

    @Override
    public String toString() {

        // TODO 3: If a field is empty, the method should add, “Data not available” after the label.
        String emptyStatement = "Data not available";

        if (name.equals("")) {
            name = emptyStatement;
        }
        if (employer.getValue().equals("")) {
            employer.setValue(emptyStatement);
        }
        if (location.getValue().equals("")) {
            location.setValue(emptyStatement);
        }
        if (positionType.getValue().equals("")) {
            positionType.setValue(emptyStatement);
        }
        if (coreCompetency.getValue().equals("")) {
            coreCompetency.setValue(emptyStatement);
        }

        // TODO 2: The string should contain a label for each field, followed by the data stored in that
        //  field. Each field should be on its own line.

        String jobPost = String.format("\nID: %d\n" +
                        "Name: %s\n" +
                        "Employer: %s\n" +
                        "Location: %s\n" +
                        "Position Type: %s\n" +
                        "Core Competency: %s\n",
                id, name, employer, location, positionType, coreCompetency);

        return jobPost;
    }






    // TODO 4: (Bonus) If a Job object ONLY contains data for the id field, the method should return,
    //  “OOPS! This job does not seem to exist.”





    // GETTERS AND SETTERS
    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
