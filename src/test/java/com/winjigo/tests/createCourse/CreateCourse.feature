Feature: Check creating course

  Scenario Outline: Validate E2E scenario for creating course
    Given login with valid email "<email>" and valid password "<password>"
    When click on course button in home page
    And click on add course button in course page
    And enter course name "<courseName>" in course page
    And select course Grade in course page
    And choose course teacher in course page
    And click on create button in course page
    Then course title should be "<courseName>"
#    And click on side menu button in home page
#    And click on Logout button in side menu
    Examples:
      | email                | password   | courseName     |
      | testregister@aaa.com | Wakram_123 | Amira         |