Feature: Searching NFL standings

  Scenario Outline: search the NFL standings and check redirect
    Given Oscar enter to the espn page
    When I enter to the Playoff Machine page
    Then I verify that the <title> is visible

    Examples:
      | title                                                             |
      | 2018 NFL Playoff Machine - Simulate Matchups and Scenarios - ESPN |