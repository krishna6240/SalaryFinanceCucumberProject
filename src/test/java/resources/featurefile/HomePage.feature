Feature: SalaryFinance ContactUs Functionality

 @Regression
  Scenario: As A User I can Able To Enter Details To ContactUs Page
    Given I am on home page
    When I click On contactUs Button
    And I enter FirstName "Kajal"
    And I enter LastName "Patel"
    And I enter Company Email
    And I enter Contact Number
    And I select Country "United Kingdom"
    And I enter Company Name "ABC Ltd"
    And I select An Employee From DropDown "An employee"
    And I Enter Job Title "Director"
    And I Select Company Size "< 500"
    And I enter Massage "Hello"
    Then I click on submit Button





