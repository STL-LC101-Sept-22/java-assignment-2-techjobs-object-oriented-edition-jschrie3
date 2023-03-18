package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest extends AbstractTest {

    // TEST THE EMPTY CONSTRUCTOR
    // TODO 1: In JobTest, define a test called testSettingJobId. Do not forget to annotate it with @Test.

    @Test
    public void testSettingJobId () {

        // TODO 2: Create two Job objects using the empty constructor.

        Job testJob1 = new Job();
        Job testJob2 = new Job();

        // TODO 3: Use assertNotEquals to verify that the IDs of the two objects are distinct.

        // create a spec to print message if test fails
        String spec = "the IDs of testJobs 1 and 2 are NOT distinct";

        assertNotEquals(spec, testJob1.getId(), testJob2.getId());
        // trying both ways (switching unexpected and actual) just in case
        assertNotEquals(spec, testJob2.getId(), testJob1.getId());
    }

    // TEST THE FULL CONSTRUCTOR
    // TODO 1: In JobTest, define a test called testJobConstructorSetsAllFields.

    @Test
    public void testJobConstructorSetsAllFields() {

        // TODO 2: Declare and initialize a new Job object with the following data:

        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // TODO 3: Use assertTrue and assertEquals statements to test that the constructor correctly assigns both the class and value of each field.
        //  Your test should have 5 assert statements of each type.

        // assertTrue statements for each class
        assertTrue(testJob3 instanceof Job);
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertTrue(testJob3.getLocation() instanceof Location);
        assertTrue(testJob3.getPositionType() instanceof PositionType);
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);

        // assertEquals statements for each class
        assertEquals("Product tester", testJob3.getName());
        assertEquals("ACME", testJob3.getEmployer().getValue());
        assertEquals("Desert", testJob3.getLocation().getValue());
        assertEquals("Quality control", testJob3.getPositionType().getValue());
        assertEquals("Persistence", testJob3.getCoreCompetency().getValue());
    }

    // TEST THE EQUALS METHOD
    // TODO 1: In JobTest, define a test called testJobsForEquality.

    @Test
    public void testJobsForEquality() {

        // TODO 2a: Generate two Job objects that have identical field values EXCEPT for id.

        Job testJob4 = new Job("Analyst", new Employer("StartUp"), new Location("Swamp"), new PositionType("Data analysis"), new CoreCompetency("Detail oriented"));
        Job testJob5 = new Job("Analyst", new Employer("StartUp"), new Location("Swamp"), new PositionType("Data analysis"), new CoreCompetency("Detail oriented"));

        // TODO 2b: Test that equals returns false.

        assertNotEquals(testJob4.getId(), testJob5.getId());
    }

    // CREATE FIRST TEST FOR TOSTRING
    // TODO 1: In JobTest, add a new test named testToStringStartsAndEndsWithNewLine to check the first requirement.

    @Test
    public void testToStringStartsAndEndsWithNewLine() {

        // TODO 2: Be sure to use assertEquals to verify that these characters are correct, and to use the exact
        //  formatting demonstrated above.

        // REQ 1: When passed a Job object, it should return a string that contains a blank line before
        //  and after the job information.

        // create a job object
        Job jobTest6 = new Job("Analyst", new Employer("StartUp"), new Location("Swamp"), new PositionType("Data analysis"), new CoreCompetency("Detail oriented"));

        // when passed a job object, toString should return a blank line before and after
        // the job information string - using format specifiers because of string format method
        String expected = String.format("\nID: %d\n" +
                        "Name: %s\n" +
                        "Employer: %s\n" +
                        "Location: %s\n" +
                        "Position Type: %s\n" +
                        "Core Competency: %s\n",
                jobTest6.getId(), jobTest6.getName(),
                jobTest6.getEmployer(), jobTest6.getLocation(),
                jobTest6.getPositionType(), jobTest6.getCoreCompetency());

        assertEquals(expected, jobTest6.toString()); // call toString method on jobTest6
    }

    // FINISH TDD FOR TOSTRING
    // TODO 1: Code a new test for the second required behavior, named testToStringContainsCorrectLabelsAndData.
    //  Then run the tests to make sure the new one fails.

    // REQ 2: The string should contain a label for each field, followed by the data stored in that field.
    // Each field should be on its own line.

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        // create a job object
        Job jobTest7 = new Job("Analyst", new Employer("StartUp"), new Location("Swamp"), new PositionType("Data analysis"), new CoreCompetency("Detail oriented"));
        // set expected value
        String expected = String.format("\nID: %d\n" +
                        "Name: %s\n" +
                        "Employer: %s\n" +
                        "Location: %s\n" +
                        "Position Type: %s\n" +
                        "Core Competency: %s\n",
                jobTest7.getId(), jobTest7.getName(),
                jobTest7.getEmployer(), jobTest7.getLocation(),
                jobTest7.getPositionType(), jobTest7.getCoreCompetency());
        // call tostring method and test that it contains the expected value
        assertTrue(jobTest7.toString().contains(expected));
    }

    // TODO 3: Follow the same TDD process for the third requirement, creating a test named testToStringHandlesEmptyField.

    // REQ 3: If a field is empty, the method should add, “Data not available” after the label.

    @Test
    public void testToStringHandlesEmptyField() {
        // create a job object - employer is empty
        Job jobTest8 = new Job("Analyst", new Employer(""), new Location("Swamp"), new PositionType("Data analysis"), new CoreCompetency("Detail oriented"));
        // set expected value
        String expected = "Data not available";
        // test if expected value is equal to the output for the empty field
        assertTrue(expected.contains(jobTest8.getEmployer().getValue()));
    }

}
