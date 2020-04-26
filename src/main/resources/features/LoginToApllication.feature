Feature: Login To Application

  @ManagerLogin @TC001
    #we will have different implementations of different methods in each page
  Scenario: Login as a manager
    Given User on "Login" page for "VyTrack" application
    When User enters "manager-username" on "Login" page
    And User enters "manager-password" on "login" page
    And User clicks on "Login" button on "Login" page
    Then "Title" should be "Dashboard" on "Dashboard" page

