@logout
Feature: Logout from application

Background:
  Given the User_Evelin is on the login page
  And enter login with "salesmanager99@info.com" and "salesmanager"
  And user enters to "#Inbox" page

  Scenario: user logout from application through avatar button
    And click on "dropdawn" button
    Then a drop down many is displayed
    And user clicks on "logout" button
    Then users navigate to "Login | Best solution for startups" page


