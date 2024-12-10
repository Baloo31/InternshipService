Feature: Track candidate history
  As a faculty member or recruiter
  I want to track a candidate's past experiences and outcomes
  So that I can evaluate their performance and potential effectively

  Scenario: View a candidate's past internships and statuses
    Given I am logged in as a faculty member or recruiter
    When I navigate to the "Candidate History" section
    And I select a candidate "John Doe"
    Then I should see a list of their past internships with statuses
    And I should see their overall performance data

  Scenario: Verify a candidate has no history
    Given I am logged in as a faculty member or recruiter
    When I navigate to the "Candidate History" section
    And I select a candidate "Jane Smith"
    Then I should see a message "No history available for this candidate"