Feature: Upload certificates or grades
  As a faculty member
  I want to upload certificates or grades for students
  So that the platform can validate and record internship completion

  Scenario: Upload a certificate in PDF format
    Given I am logged in as a faculty member
    When I navigate to the "Certificates" section
    And I select a specific student
    And I upload a certificate file in PDF format
    Then the certificate should be successfully uploaded
    And the platform should validate the file format

  Scenario: Upload a grade as an image file
    Given I am logged in as a faculty member
    When I navigate to the "Certificates" section
    And I select a specific student
    And I upload a grade file in image format
    Then the grade file should be successfully uploaded
    And the platform should validate the file format