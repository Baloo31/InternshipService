Feature: Internship application tracking
  As a student
  I want to track the progress of my internship applications
  So that I stay updated about their status

  Scenario: View the status of an internship application
    Given I am logged in as a student
    And I have applied for an internship
    When I navigate to the "Applications" section
    Then I should see a list of my internship applications
    And Each application should show its current status