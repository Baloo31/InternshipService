Feature: Track the status of candidates for an internship
  As a company representative
  I want to monitor the status of candidates in real-time
  So that I can make informed decisions about their progress

  Scenario: View candidate statuses in a specific internship
    Given I am logged in as a company representative
    When I navigate to the "Applications" section of a specific internship
    Then I should see a list of candidates
    And each candidate's status should be displayed dynamically in real-time

  Scenario: Candidate status updates dynamically
    Given I am logged in as a company representative
    And I am viewing the "Applications" section of a specific internship
    When a candidate's status changes to "Accepted"
    Then the change should be reflected in real-time on the dashboard