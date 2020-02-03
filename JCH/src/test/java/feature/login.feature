
@smoke 
Feature: JCH Application test
  
  Scenario Outline: Validate JCH home page navigation test
    Given I am in login page
    And verify Login page title
    When I enter "<username>" and "<password>" and logs in 
    Then I navigate to home page
    And validate logged in username

  
    Examples: 
      | username  | password | 
      | akash@codemantra.com | Santhan#123 |  
     
Scenario: Successful Logout from home page
When user log out from the application
Then User is navigated to login page

