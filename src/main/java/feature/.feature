Feature: Checking the drawing functionality of the HTML Studio page app
  Scenario: Drawing functionality
    Given  user has navigate to the url
    When  user click on the draw a line
    Then  user can draw one horizontal line and vertical line should be intercept
    When  user can click on draw a rectangle line
    Then user can draw a rectangle
    And  user can click use eraser and erase the horizontal line