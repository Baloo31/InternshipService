package stepdefinitions;

import io.cucumber.java.en.When;

public class NavigationSteps {

    @When("I navigate to the {string} section")
    public void iNavigateToTheSection(String section) {
        System.out.println("Navigated to section: " + section);
    }
}
