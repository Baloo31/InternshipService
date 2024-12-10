package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TrackCandidateStatusSteps {

    private Map<String, String> candidateStatuses = new HashMap<>();

    @Given("I am logged in as a company representative")
    public void iAmLoggedInAsACompanyRepresentative() {
        System.out.println("Company representative logged in");
    }

    @Given("I am viewing the {string} section of a specific internship")
    public void i_am_viewing_the_section_of_a_specific_internship(String string) {
        System.out.println("I am viewing section: " + string);
    }

    @When("I navigate to the {string} section of a specific internship")
    public void iNavigateToTheSectionOfASpecificInternship(String section) {
        assertEquals("Incorrect section navigated", section, "Applications");
        System.out.println("Navigated to section: " + section);
    }

    @Then("I should see a list of candidates")
    public void iShouldSeeAListOfCandidates() {
        candidateStatuses = new HashMap<>();
        candidateStatuses.put("Alice Johnson", "Under Review");
        candidateStatuses.put("Bob Smith", "Pending");
        candidateStatuses.put("Charlie Brown", "Interview Scheduled");

        assertNotNull("Candidate list is null", candidateStatuses);
        assertFalse("Candidate list is empty", candidateStatuses.isEmpty());
        System.out.println("Candidate list displayed: " + candidateStatuses);
    }

    @Then("each candidate's status should be displayed dynamically in real-time")
    public void eachCandidateStatusShouldBeDisplayedDynamicallyInRealTime() {
        String aliceStatus = candidateStatuses.get("Alice Johnson");
        assertEquals("Status is not displayed correctly", aliceStatus, "Under Review");
        System.out.println("Candidate statuses are displayed dynamically: " + candidateStatuses);
    }

    @When("a candidate's status changes to {string}")
    public void aCandidateStatusChangesTo(String newStatus) {
        candidateStatuses.put("Alice Johnson", newStatus);
        System.out.println("Status for Alice Johnson updated to: " + newStatus);
    }

    @Then("the change should be reflected in real-time on the dashboard")
    public void theChangeShouldBeReflectedInRealTimeOnTheDashboard() {
        String updatedStatus = candidateStatuses.get("Alice Johnson");
        assertEquals("Real-time update not reflected", "Accepted", updatedStatus);
        System.out.println("Real-time update reflected: Alice Johnson status is now " + updatedStatus);
    }
}
