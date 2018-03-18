
Feature: Note on Dashboard
  Scenario: Post a note on Dashboard
 	  Given I logged into suiteCRM
    When I post "Hello Eveyone"
    Then Post should be diplayed
    Then I log out
    
  
    

