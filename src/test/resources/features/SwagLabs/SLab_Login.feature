@tag
Feature: Verify Login Functionality
  			I am checking loging feature with different sets of data

  @tag1
  Scenario Outline: Validating Login feature with valid data
    Given SLab user is on login page
    When SLabser clicks on Login button with entering valid Username "<sheetName>" and Password <Rownumber>
    Then SLab user should land on home page

    Examples: 
      | sheetName | Rownumber |
      | SLabHomePage |         0 |
#
  #@tag2
  #Scenario Outline: Validating Login feature with invalid data
    #Given SLab user is on login page
    #When SLabser clicks on Login button with entering valid Username “<sheetName>” and Password <rownumber>
    #Then SLab user should land on home page
#
    #Examples: 
      #| sheetName | rownumber |
      #| SLabHomePage |         1 |
      #| SLabHomePage |         2 |
      #| SLabHomePage |         3 |
     
     
    #@tag3
    #Scenario Outline: Validate login with valid credentials
    #Given SLab user is in Home Page
    #When SLab user enters sheetname "<sheetName>" and rownumber <rowNumber>
    #And SLab userusername "<userName>" and password "<password>" and click on login button
    #Then SLab user navigates to DashBoard Page
    #Examples:
      #| sheetName | rowNumber |
#	    | SLabHomePage | 0       |
