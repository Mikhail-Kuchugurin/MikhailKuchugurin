Feature: Verify home page, login and diff elements page

  @Test-01
  Scenario: Home page, login and diff elements test
    Given I am on "Home Page"
    Then Page title is 'Home_Page'
    When I login as user 'Piter'
    Then I am logged as 'Piter'
    And Images on the main page are displayed
    And Texts under images on the main page are displayed
    And Headline is displayed
    And Description under headline is displayed
    And Service header menu is displayed
    And Left service menu is displayed
    When I open Different Elements Page
    Then I check checkboxes/radiobtns/dropdown/defaultbtn/inputbtn
    And Right section is displayed
    And Left section is displayed
    When i select 'Water'
    Then Log is corresponding to selected 'WATER_TRUE'
    When i select 'Wind'
    Then Log is corresponding to selected 'WIND_TRUE'
    When i select 'Selen'
    Then Log is corresponding to selected 'SELEN'
    When I select color 'Yellow'
    Then Log is corresponding to selected 'YELLOW'
    When I unselect 'Water'
    Then Log is corresponding to selected 'WATER_FALSE'
    When I unselect 'Wind'
    Then Log is corresponding to selected 'WIND_FALSE'
