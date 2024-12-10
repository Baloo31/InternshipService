package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InternshipTrackingSteps {

    @Given("I am logged in as a student")
    public void iAmLoggedInAsAStudent() {
        System.out.println("Student logged in");
    }

    @And("I have applied for an internship")
    public void iHaveAppliedForAnInternship() {
        System.out.println("Internship application submitted");
    }

    @Then("I should see a list of my internship applications")
    public void iShouldSeeAListOfMyInternshipApplications() {
        System.out.println("List of applications displayed");
    }

    @Then("Each application should show its current status")
    public void eachApplicationShouldShowItsCurrentStatus() {
        System.out.println("List of applications with their status displayed");
    }
}
