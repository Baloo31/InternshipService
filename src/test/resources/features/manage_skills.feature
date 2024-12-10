Feature: Manage skills on profile
  As a student
  I want to manage my skillset on my profile
  So that I can showcase my capabilities to recruiters

  Scenario: Add a skill to my profile
    Given I am logged in as a student
    When I navigate to the "Profile" section
    And I add a new skill "Python Programming"
    Then the skill "Python Programming" should appear in my list of skills

  Scenario: Update an existing skill on my profile
    Given I am logged in as a student
    And I have a skill "Java Programming" in my profile
    When I update "Java Programming" to "Advanced Java Programming"
    Then my profile should show the updated skill "Advanced Java Programming"

  Scenario: Remove a skill from my profile
    Given I am logged in as a student
    And I have a skill "HTML" in my profile
    When I remove the skill "HTML"
    Then the skill "HTML" should no longer appear in my list of skills