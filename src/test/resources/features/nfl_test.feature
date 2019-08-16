Feature: Searching NFL standings

  Scenario Outline: search the NFL standings and check redirect
    Given Oscar enter the espn page
    When I enter the nfl standings
    Then I verify that the <title> is visible

    Examples:
      | title                        |
      | NFL Preseason Standings 2019 |