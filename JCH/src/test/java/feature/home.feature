#Feature: JCH Application test
  #
#@execute 
   #Scenario Outline: Validate JCH home page Dashboard-Favorite navigation
    #Given User is in login page
    #When user logs in with "<username>" and "<password>"
    #Then user is navigated to Home page
    #When user clicks on All Journals on Dashboard
    #Then user is navigated to All Journals page
    #And user clicks on drop down arrow of Actions column to select Favorites
    #Then validate favorite queries are displayed
              #
   #Examples: 
      #| username  | password | 
      #| akash@codemantra.com | Santhan#123 | 
#
#Scenario: Successful Logout
#When user is logging out from the application
#Then User navigates to login page
#
#
