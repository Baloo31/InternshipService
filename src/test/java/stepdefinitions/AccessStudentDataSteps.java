package stepdefinitions;

import io.cucumber.java.en.*;

public class AccessStudentDataSteps {

    @Given("I am logged in as a company member")
    public void iAmLoggedInAsAnAdmin() {
        System.out.println("Company member logged in");
    }

    @When("I select a specific student")
    public void iSelectASpecificStudent() {
        System.out.println("Selected a student");
    }

    @Then("I should see the student's profile information")
    public void iShouldSeeTheStudentsProfileInformation() {
        System.out.println("Profile information displayed");
    }

    @Then("I should see a link to download their CV")
    public void iShouldSeeALinkToDownloadTheirCV() {
        System.out.println("CV download link visible");
    }

    @Then("I should see metrics like {string} and {string}")
    public void i_should_see_metrics_like_and(String string, String string2) {
        System.out.println("Found metrics: " + string + " and " + string2);
    }
}
