package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrackCandidateHistorySteps {

    private Map<String, List<String>> candidateHistory = new HashMap<>();
    private String selectedCandidate;

    @Given("I am logged in as a faculty member or recruiter")
    public void iAmLoggedInAsAFacultyMemberOrRecruiter() {
        candidateHistory.put("John Doe", List.of("Internship at XYZ Corp - Completed", "Internship at ABC Ltd - Pending"));
        System.out.println("Logged in as faculty or recruiter");
    }

    @When("I select a candidate {string}")
    public void iSelectACandidate(String candidate) {
        // Simulate selecting a candidate
        selectedCandidate = candidate;
        System.out.println("Selected candidate: " + candidate);
    }

    @Then("I should see a list of their past internships with statuses")
    public void iShouldSeeAListOfTheirPastInternshipsWithStatuses() {
        // Fetch and display candidate's history
        if (candidateHistory.containsKey(selectedCandidate)) {
            List<String> history = candidateHistory.get(selectedCandidate);
            System.out.println("Past internships for " + selectedCandidate + ": " + history);
        } else {
            System.out.println("No history available for " + selectedCandidate);
        }
    }

    @Then("I should see their overall performance data")
    public void i_should_see_their_overall_performance_data() {
        System.out.println("Overall performance data");
    }

    @Then("I should see a message {string}")
    public void iShouldSeeAMessage(String message) {
        // Display a message for candidates with no history
        if (!candidateHistory.containsKey(selectedCandidate)) {
            System.out.println("Message displayed: " + message);
        } else {
            System.out.println("Candidate has a history; no message displayed.");
        }
    }
}
