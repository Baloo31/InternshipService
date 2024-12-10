package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ManageSkillsSteps {

    private final List<String> skills = new ArrayList<>();

    @When("I add a new skill {string}")
    public void iAddANewSkill(String skill) {
        skills.add(skill);
        System.out.println("Added skill: " + skill);
    }

    @Then("the skill {string} should appear in my list of skills")
    public void theSkillShouldAppearInMyListOfSkills(String skill) {
        assertTrue("Skill not found in the list", skills.contains(skill));
        System.out.println("Verified skill present: " + skill);
    }

    @And("I have a skill {string} in my profile")
    public void iHaveASkillInMyProfile(String skill) {
        skills.add(skill);
        System.out.println("Existing skill added: " + skill);
    }

    @When("I update {string} to {string}")
    public void iUpdateTo(String oldSkill, String newSkill) {
        int index = skills.indexOf(oldSkill);
        if (index != -1) {
            skills.set(index, newSkill);
            System.out.println("Updated skill from " + oldSkill + " to " + newSkill);
        } else {
            fail("Old skill not found for update");
        }
    }

    @Then("my profile should show the updated skill {string}")
    public void myProfileShouldShowTheUpdatedSkill(String updatedSkill) {
        assertTrue("Updated skill not found in the list", skills.contains(updatedSkill));
        System.out.println("Verified updated skill present: " + updatedSkill);
    }

    @When("I remove the skill {string}")
    public void iRemoveTheSkill(String skill) {
        if (skills.contains(skill)) {
            skills.remove(skill);
            System.out.println("Removed skill: " + skill);
        } else {
            fail("Skill not found for removal");
        }
    }

    @Then("the skill {string} should no longer appear in my list of skills")
    public void theSkillShouldNoLongerAppearInMyListOfSkills(String skill) {
        assertFalse("Skill still present in the list", skills.contains(skill));
        System.out.println("Verified skill removed: " + skill);
    }
}
