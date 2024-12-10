Feature: View enrolled students for an internship
  As a faculty member
  I want to see a list of students participating in internships
  So that I can monitor their progress effectively

  Scenario: View the list of enrolled students in a specific internship
    Given I am logged in as a faculty member
    When I navigate to the "Internships" section
    And I select a specific internship
    Then I should see a dashboard displaying a list of enrolled students
    And The list should be updated with the latest data