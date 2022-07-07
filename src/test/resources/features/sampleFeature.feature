Feature: Check sample_Feature
  Scenario: Logo present in xyz page
    Given   I Launch chrome browser
    When i open xyz website
    And login into test site
    Then Verify the  logo ont the page
    And close tab
