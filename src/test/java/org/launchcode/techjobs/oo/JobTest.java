package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest extends AbstractTest {

    // TEST THE EMPTY CONSTRUCTOR

    // TODO 1: In JobTest, define a test called testSettingJobId. Do not forget to annotate it with @Test.

    @Test
    public void testSettingJobId() {

        // TODO 2: Create two Job objects using the empty constructor.

        Job testJob1 = new Job();
        Job testJob2 = new Job();

        // TODO 3: Use assertNotEquals to verify that the IDs of the two objects are distinct.
        // assertNotEquals(Object, Object)
        assertNotEquals(testJob1, testJob2);
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

}
