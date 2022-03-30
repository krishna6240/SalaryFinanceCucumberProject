$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "SalaryFinance ContactUs Functionality",
  "description": "",
  "id": "salaryfinance-contactus-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12820271400,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "As A User I can Able To Enter Details To ContactUs Page",
  "description": "",
  "id": "salaryfinance-contactus-functionality;as-a-user-i-can-able-to-enter-details-to-contactus-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click On contactUs Button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter FirstName \"Kajal\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter LastName \"Patel\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter Company Email",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter Contact Number",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select Country \"United Kingdom\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter Company Name \"ABC Ltd\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select An Employee From DropDown \"An employee\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I Enter Job Title \"Director\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I Select Company Size \"\u003c 500\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter Massage \"Hello\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on submit Button",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 455643099,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnContactUsButton()"
});
formatter.result({
  "duration": 3690464900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kajal",
      "offset": 19
    }
  ],
  "location": "MyStepdefs.iEnterFirstName(String)"
});
formatter.result({
  "duration": 403065200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Patel",
      "offset": 18
    }
  ],
  "location": "MyStepdefs.iEnterLastName(String)"
});
formatter.result({
  "duration": 506458500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iEnterCompanyEmail()"
});
formatter.result({
  "duration": 451716400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iEnterContactNumber()"
});
formatter.result({
  "duration": 366227700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "United Kingdom",
      "offset": 18
    }
  ],
  "location": "MyStepdefs.iSelectCountry(String)"
});
formatter.result({
  "duration": 342412700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ABC Ltd",
      "offset": 22
    }
  ],
  "location": "MyStepdefs.iEnterCompanyName(String)"
});
formatter.result({
  "duration": 273941300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "An employee",
      "offset": 36
    }
  ],
  "location": "MyStepdefs.iSelectAnEmployeeFromDropDown(String)"
});
formatter.result({
  "duration": 286547600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Director",
      "offset": 19
    }
  ],
  "location": "MyStepdefs.iEnterJobTitle(String)"
});
formatter.result({
  "duration": 500314600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003c 500",
      "offset": 23
    }
  ],
  "location": "MyStepdefs.iSelectCompanySize(String)"
});
formatter.result({
  "duration": 425742000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello",
      "offset": 17
    }
  ],
  "location": "MyStepdefs.iEnterMassage(String)"
});
formatter.result({
  "duration": 516172900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnSubmitButton()"
});
formatter.result({
  "duration": 437654299,
  "status": "passed"
});
formatter.after({
  "duration": 135599,
  "status": "passed"
});
});