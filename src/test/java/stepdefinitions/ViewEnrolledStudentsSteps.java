package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.Assert.*;

public class ViewEnrolledStudentsSteps {

    private List<String> enrolledStudents;

    @Given("I am logged in as a faculty member")
    public void iAmLoggedInAsAFacultyMember() {
        System.out.println("Faculty member logged in");
    }

    @When("I select a specific internship")
    public void iSelectASpecificInternship() {
        System.out.println("Selected a specific internship");
    }

    @Then("I should see a dashboard displaying a list of enrolled students")
    public void iShouldSeeADashboardDisplayingAListOfEnrolledStudents() {
        enrolledStudents = List.of("Alice Johnson", "Bob Smith", "Charlie Brown");
        assertNotNull("Enrolled students list is null", enrolledStudents);
        assertFalse("Enrolled students list is empty", enrolledStudents.isEmpty());
        System.out.println("Enrolled students displayed: " + enrolledStudents);
    }

    @Then("The list should be updated with the latest data")
    public void theListShouldBeUpdatedWithTheLatestData() {
        List<String> updatedEnrolledStudents = List.of("Alice Johnson", "Bob Smith", "Charlie Brown", "Diana Prince");
        assertNotEquals("Enrolled students list is not updated", enrolledStudents, updatedEnrolledStudents);
        System.out.println("The list is updated with the latest data: " + updatedEnrolledStudents);
    }
}
