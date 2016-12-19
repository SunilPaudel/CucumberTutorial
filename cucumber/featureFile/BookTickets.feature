Feature: Book the tickets

  Scenario Outline: The data is provided here
    Given the Chrome browser is launched
    And the url is loaded
    When from "<from>" to "<to>" cities are selected
    And the "<type of journey>" is selected
    And the dates "<depart>" to "<return>" are selected
    Then the search flights button is clicked
    And the flights are displayed

    Examples: 
      | from         | to           | type of journey | depart     | return     |
      | Zurich (ZRH) | Munich (MUC) | Return          | 01/04/2017 | 09/04/2017 |
