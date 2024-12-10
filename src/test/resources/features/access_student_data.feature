Feature: Access student data and CVs
  As an admin
  I want to view student profiles, CVs, and statistics
  So that I can assess potential candidates for internships

  Scenario: View a student's profile and CV
    Given I am logged in as a company member
    When I navigate to the "Students" section
    And I select a specific student
    Then I should see the student's profile information
    And I should see a link to download their CV

  Scenario: View statistical data about students
    Given I am logged in as a company member
    When I navigate to the "Statistics" section
    Then I should see metrics like "Number of enrolled students" and "Average grades"