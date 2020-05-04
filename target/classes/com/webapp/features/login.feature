@Regression
Feature: To test all the functionality of OrangeHRM Demo App

  @Login
  Scenario: To test login feature from OrangeHRM App
    Given the user launches the url
    When the user login to the App
      | LOGIN Panel | Forgot your password? |
    Then the user should see the home page "OrangeHRM"

  @Home @Login
  Scenario Outline: To test Dashboard page present on Home
    Given the user validates url of the "<url>" current page
    When the user verifies the "Welcome Admin" label on it.

    Examples: 
      | url                                                           |
      | https://opensource-demo.orangehrmlive.com/index.php/dashboard |

  @Admin
  Scenario: To test labels preset in the Admin icon
    Given the user clicks admin icon
    When the user verifies labels on it
      | User Management | Job | Organization | Qualifications | Nationalities | Configuration |
